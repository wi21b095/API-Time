package com.example.apitime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController

public class API_Time_Controller {
    @GetMapping("/sum")

    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    /*
    public float Date {
    LocalTime myTime = LocalTime.now();
    return myTime;
    }*/
}
