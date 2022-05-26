package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("-----------main starts-----------");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Customer cust = ctx.getBean( Customer.class);
        cust.setId(99);
        cust.setCname("Arumugam Brothers");
        cust.setAddress("Chennai");
        System.out.println(cust);

        for(String name: ctx.getBeanDefinitionNames())
            System.out.println(name);
        
        ((ClassPathXmlApplicationContext)ctx).close();
        System.out.println("------------main ends------------");
    }
}
