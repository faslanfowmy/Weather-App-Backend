# 🌦️ Weather App Backend

This is the backend service for the Weather App assignment built with **Spring Boot**. It exposes secure REST APIs to retrieve weather data from the [OpenWeatherMap API](https://openweathermap.org/api), protected using **JWT authentication** via **Auth0**.

---

## 📦 Tech Stack

- Java 23
- Spring Boot 3.x
- Spring Security (Auth0)
- Spring Web
- WebClient (OpenWeather API)
- **Caffeine Cache** (for response caching)
- **Lombok** (for cleaner POJOs)
- Maven

---

## 📁 Project Structure

weather-app-backend/
├── src/
│ └── main/
│ ├── java/com/faslan/weatherapp/ # Java source
│ │ ├── controller/ # REST Controllers
│ │ ├── model/ # DTOs and Models
│ │ ├── config/ # Security and caching config
│ │ └── WeatherAppApplication.java # Main entry point
│ └── resources/
│ └── application.properties # Configured with required values
├── .gitignore
├── pom.xml
└── README.md


---

## 🔐 Auth0 & API Key Setup

✅ Already configured in `application.properties`:

- **Auth0 Audience**
- **Auth0 Issuer**
- **OpenWeatherMap API Key**

You don't need to set up anything manually — just clone and run.

---

## 🚀 Running the App

### 1. Clone the Repository

 #### git clone https://github.com/faslanfowmy/Weather-App-Backend.git
 #### cd Weather-App-Backend


## Run the Spring Boot App

### ./mvnw spring-boot:run


## 📬 Contact
If you encounter any issues or have questions:

Fazlan Fowmy
📧 fazlanfowmy@gmail.com

