🛒 Zepto-Blinkit Clone: Java Full-Stack App
A functional full-stack grocery delivery system featuring a Spring Boot backend, MySQL database, and React Native (Expo) mobile interface.

🛠️ Tech Stack
Backend: Java 24, Spring Boot 3.5.9, JPA/Hibernate.

Database: MySQL 9.3.

Mobile: React Native, Expo, Axios.

Real-time: Firebase Cloud Messaging (Push Notifications).

🚀 Features
Live Catalog: Fetches grocery items with images and categories from the Spring Boot API.

Dynamic Cart: Real-time state management for adding items and calculating savings.

Database Checkout: Saves orders directly to MySQL upon mobile checkout.

Push Notifications: Backend-triggered "Order Out for Delivery" alerts via Firebase.

📂 Structure
/backend: Java source code, Maven config, and Firebase service key.

/frontend: React Native logic, cart UI, and notification listeners.

🚦 Quick Start
Backend: Add serviceAccountKey.json to resources and run ./mvnw spring-boot:run.

Frontend: Update the Mac IP address in App.js and run npx expo start.
