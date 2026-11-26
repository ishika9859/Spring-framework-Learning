package com.example.autowiring.annoation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context
//                = new ClassPathXmlApplicationContext("componentScan.XML");



        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        Manager manager = (Manager) context.getBean("manager");
        System.out.println(manager.displayDetails());
    }
}
