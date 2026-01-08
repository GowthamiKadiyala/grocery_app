package com.grocery.backend.controller;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.grocery.backend.model.Order;
import com.grocery.backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/checkout")
    public Order placeOrder(@RequestBody Order order) {
        order.setOrderDate(LocalDateTime.now());
        order.setStatus("PAID"); 
        return orderRepository.save(order);
    }

    @PutMapping("/{id}/status")
    public String updateStatus(@PathVariable Long id, @RequestParam String status) throws Exception {
        Order order = orderRepository.findById(id).orElseThrow();
        order.setStatus(status);
        orderRepository.save(order);

        if ("OUT_FOR_DELIVERY".equals(status)) {
            Message message = Message.builder()
                .setNotification(Notification.builder()
                    .setTitle("Order Out for Delivery! 🛵")
                    .setBody("Your grocery items are on the way.")
                    .build())
                .setTopic("orders") 
                .build();
            FirebaseMessaging.getInstance().send(message);
        }
        return "Order updated and notification sent!";
    }
}