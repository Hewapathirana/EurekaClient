package com.testmicroservice.testService.models;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Amila Wickramarathne.
 * Date: 8/2/2019
 * Time: 11:53 AM
 */

@Component
public class Test {

    private String testService;


    public String getTestService() {
        return testService;
    }

    public void setTestService(String testService) {
        this.testService = testService;
    }
}
