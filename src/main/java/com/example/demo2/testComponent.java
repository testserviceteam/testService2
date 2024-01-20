package com.example.demo2;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testComponent {

    @GetMapping(value = "/")
    public String test() {
        // 원하는 처리 수행
        return "[GET] test2 is running@@@@";
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test2(@RequestBody RequestPayload requestPayload) {
        // 원하는 처리 수행
        System.out.println("requestPayload.getRequestID() : " + requestPayload.getRequestID());
        return "[POST] test2 is running";
    }
}
