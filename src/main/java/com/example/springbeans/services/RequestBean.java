package com.example.springbeans.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestBean {
    private final String instanceId;

    public RequestBean() {
        this.instanceId = "RequestBean-" + System.currentTimeMillis();
        System.out.println("Request Bean created: " + instanceId);
    }

    public String getInstanceId() {
        return instanceId;
    }
}
