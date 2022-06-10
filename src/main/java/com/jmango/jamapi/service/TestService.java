package com.jmango.jamapi.service;

import com.jmango.jamapi.model.exception.BusinessException;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String demoResponse() {
        int max = 3;
        int min = 1;
        int range = max - min + 1;

        int randNum = (int)(Math.random() * range) + min;

        if (randNum == max) {
            throw new BusinessException(153, "BusinessException");
        }
        if (randNum == min) {
            throw new RuntimeException("RuntimeException");
        }

        return "demo response";
    }
}
