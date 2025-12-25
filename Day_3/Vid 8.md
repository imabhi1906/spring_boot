23-Dec-2025

Learned what is IOC (Inversion of Control). How it works and learned about the @Component annotation. What it does is It tells the java IOC that the annotated class can be thrown inside the IOC box so that it can be used everywhere in the project.

Then comes the @SpringBootApplication annotation.
this annotation is used only once in a java project as this annotation is used only over the main class in the java project.

It basically does 3 tasks. They are @Configuration, @EnableAutoConfiguration & @ComponentScan. 

## What is @ComponentScan?
It is the annotation that triggers the scanning of @Component annotation and storing all the @Component classes into IOC

this is also aided wit the help of @Autowired. This annotation creates objects automatically. you dont have to initialise new objects manually. You can directly initialise new objects anywhere in the broject if that class is saved with @Component annotation.

## What is @EnableAutoConfiguration?
It helps in managing the configuration of the java project automatically. Like if you want to setup mongodb, then the @EnableAutoConfiguration will configure the ports, username, passwords, etc automatically for the java project. 

## What is @Configuration ?
This is used in 