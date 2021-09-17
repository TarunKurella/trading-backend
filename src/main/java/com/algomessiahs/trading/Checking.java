package com.algomessiahs.trading;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checking {

    @GetMapping("check")
    String checking(){
        return "Backend is functional"+"vineeth";
    }
}
