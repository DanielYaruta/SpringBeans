package com.example.springbeans;

import com.example.springbeans.services.RequestBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    private final RequestBean requestBean;

    public TestController(RequestBean requestBean) {
        this.requestBean = requestBean;
    }

    @GetMapping("/request-bean")
    public String getRequestBean() {
        return "Request Bean Instance: " + requestBean.getInstanceId();
    }
}
