package com.example.demo.service;

import com.example.demo.domain.Auto;
import com.example.demo.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;


    public Iterable<Auto> getAll() {
        return autoRepository.findAll();
    }

    public void saveAuto(Auto a) {
        autoRepository.save(a);
    }
}
