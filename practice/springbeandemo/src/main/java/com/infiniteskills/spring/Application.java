package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        BeanA beanA = context.getBean("beanA",BeanA.class);
        beanA.getBeanB().execute();

        System.out.println(context.getBean("beanA",BeanA.class).getYear());

    }
}
