# Spring Framework – Core Concepts & Learning

This repository documents my learning journey with the **Spring Framework**, focusing on understanding its core concepts, how they work, and the problems they solve in Java application development.

Rather than focusing only on implementation, my approach has been to understand the reasoning behind each concept and how different parts of the Spring Framework work together.

## Concepts Explored

### 1. Spring Core & IoC

- Introduction to Spring Framework
- Inversion of Control (IoC)
- IoC Container
- BeanFactory and ApplicationContext
- Spring Beans and Bean Management

### 2. Dependency Injection

- Understanding Dependency Injection (DI)
- Constructor Injection
- Setter Injection
- Autowiring and its different modes
- Resolving dependency ambiguity using `@Qualifier` and `@Primary`
- Understanding tight coupling and loose coupling

### 3. Spring Configuration

Explored different approaches to configuring Spring applications:

- **XML-Based Configuration**

  - Bean definitions
  - Constructor and setter injection
  - Understanding `ref` and `value`

- **Java-Based Configuration**

  - `@Configuration`
  - `@Bean`
  - `AnnotationConfigApplicationContext`

- **Annotation-Based Configuration**

  - `@Component`
  - `@ComponentScan`
  - `@Service`
  - `@Repository`
  - `@Autowired`

### 4. Additional Concepts

- Multiple Beans from the same Java class
- Component scanning and Bean registration
- `@Value` annotation
- External property configuration
- Spring Expression Language (SpEL)
- Bean Lifecycle and initialization concepts

## Hands-on Practice

Practised Spring Framework concepts through simple Java classes and configuration files to understand:

- How Spring creates and manages objects.
- How dependencies are resolved and injected.
- How different configuration approaches work.
- How Spring-managed components interact.
- How loose coupling can be achieved through dependency injection.

Also explored Java concepts such as:

- Interfaces and their implementations
- Generics
- ArrayList
- Optional
- Basic CRUD operations

## Technologies & Tools

- Java
- Spring Framework
- Maven
- IntelliJ IDEA

## Learning Objective

The primary objective of this repository is to build a strong foundation in Java backend development by understanding the core principles of the Spring Framework.

I believe that learning a technology is not just about knowing **HOW** to implement something, but also understanding **WHY** it exists, what problem it solves, and why a particular approach is preferred.

This repository is a work in progress as I continue exploring and strengthening my understanding of backend development.

---

**Learning by understanding, experimenting, and building a stronger foundation.**
