package com.example.springbeans.config;

import com.example.springbeans.services.PrototypeBean;
import com.example.springbeans.services.SingletonBean;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton")
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}
