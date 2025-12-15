# 🍃 Spring Boot Course: Introduction & Basics

## 🎓 Course Overview

  * **Prerequisites:** None. You do not need prior knowledge of Spring.
  * **Approach:** Starts from zero and gradually increases in difficulty.
  * **Goal:** To remove the "fear" of Spring Boot and understand how it works internally (not just "magic").

**Key Topics to be Covered:**

  * **Integrations:** MongoDB, MySQL, Redis, Elasticsearch.
  * **Core Features:** External APIs, Schedulers, Properties Files (and externalizing them via Config Server).
  * **Architecture:** Moduling, Packaging (JAR vs. WAR).
  * **Testing:** Unit testing with JUnit.

-----

## 🤔 What is Spring Boot?

Spring Boot is a toolset/framework that makes it easy to create **standalone**, **production-grade** Spring-based applications that you can "just run."

  * **Primary Goal:** To simplify the process of building Java applications.
  * **"Just Run":** It removes the heavy manual configuration steps required in legacy Spring applications.

-----

## ⚡ Spring vs. Spring Boot

Why did we need Spring Boot if Spring already existed?

| Feature | Legacy Spring Framework | Spring Boot |
| :--- | :--- | :--- |
| **Boilerplate** | Reduces code but still requires manual config. | Takes convenience to the next level by removing setup effort. |
| **Server** | Requires installing/configuring an external Web Server (e.g., Tomcat). | Comes with an **Embedded Tomcat Server**. No external install needed. |
| **Setup** | Manual setup of `ApplicationContext`. | **Auto-configuration** handles the setup automatically. |

-----

## 🔑 Key Concepts Explained

### 1\. Embedded Server

  * In the past, you had to install a server (like Tomcat) separately and deploy your code onto it.
  * **Spring Boot:** The server is "embedded" inside your application JAR. You simply run your app, and it starts the server for you. The app is self-contained.

### 2\. Annotation

  * Think of an annotation as a **hint** or instruction given to the compiler/framework.
  * **Example:** `@SpringBootApplication` tells Spring Boot, "This is the main class, please set up the configuration automatically."

### 3\. Beans

  * **Definition:** A "Bean" is simply an object managed by Spring.
  * **Concept:** Instead of creating a new object every time (`std = new Std()`), you define it once. Spring creates it, and the entire application reuses that same instance (Singleton pattern).

### 4\. Application Context

  * This is the "container" that holds all your Beans.
  * When your code needs an object, it doesn't create it manually; it asks the **Application Context** to "give me that bean."
  * **Spring Boot's Advantage:** In legacy Spring, you had to manually configure this context. Spring Boot handles this automatically behind the scenes.

-----

## 💻 Code Comparison (Conceptual)

**Without Spring Boot (Legacy):**

  * Requires manual setup of `ApplicationContext` in the main method.
  * Must explicitly tell Spring where to scan for beans using annotations like `@ComponentScan`.

**With Spring Boot:**

```java
@SpringBootApplication // Single annotation handles config & scanning
public class Application {
    public static void main(String[] args) {
        // Starts the app and sets up the embedded server automatically
        SpringApplication.run(Application.class, args);
    }
}
```
