package com.example.demo.endpoint;


import com.example.demo.domain.Auto;
import com.example.demo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoEndpoint {

    @Autowired
    private AutoService autoService;


    @GetMapping("/hello")
    public Iterable<Auto> helloWorld() {

        return autoService.getAll();
    }
}
