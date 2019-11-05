package com.example.demo.endpoint;


import com.example.demo.domain.Auto;
import com.example.demo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.stream.Stream;

@RestController
public class AutoEndpoint {

    @Autowired
    private AutoService autoService;


    @GetMapping("/auto")
    public Iterable<Auto> helloWorld() {

        return autoService.getAll();
    }


    @GetMapping("/wat")
    public ArrayList<String> watIsHet() {
        return autoService.watIsHet();
    }
}
