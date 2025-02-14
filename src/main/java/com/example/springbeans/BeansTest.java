package com.example.springbeans;

import com.example.springbeans.config.AppConfig;
import com.example.springbeans.services.PrototypeBean;
import com.example.springbeans.services.SingletonBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansTest {
    public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    SingletonBean singleton1 = context.getBean(SingletonBean.class);
    SingletonBean singleton2 = context.getBean(SingletonBean.class);
    System.out.println("Singleton Beans the same? " + (singleton1 == singleton2));

    PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
    PrototypeBean prototype2 = context.getBean(PrototypeBean.class);
    System.out.println("Prototype Beans the same? " + (prototype1 == prototype2));
}
}
