package com.example.demo;

import com.example.demo.domain.Auto;
import com.example.demo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {
    @Autowired
    private AutoService autoService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        generateData();
    }

    public void generateData() {
        autoService.saveAuto(new Auto("BMW"));
        autoService.saveAuto(new Auto("Volkswagen"));
        autoService.saveAuto(new Auto("Tesla"));
        autoService.saveAuto(new Auto("Toyota"));
    }
}
