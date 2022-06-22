package com.example.apitime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController

public class API_Time_Controller {
    @GetMapping("/time")

    public LocalTime time () {
        LocalTime myTime = LocalTime.now();
        return myTime;

    }

    /*
    public float Date {
    LocalTime myTime = LocalTime.now();
    return myTime;
    }*/
}
