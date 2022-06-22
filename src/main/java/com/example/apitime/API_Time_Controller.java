package com.example.apitime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController

public class API_Time_Controller {
    @GetMapping("/time")

    public LocalDate time () {
        LocalDate myDate = LocalDate.now();
        return myDate;
    }

    @GetMapping("/time?format=yyyy-MM-dd")
    public LocalDate timeformat1 () {
        LocalDate myDate = LocalDate.now();
        DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return myDate;
    }

    @GetMapping("/time?format=dd/MM/yyyy")
    public LocalDate timeformat2 () {
        LocalDate myDate = LocalDate.now();
        DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return myDate;
    }
}
