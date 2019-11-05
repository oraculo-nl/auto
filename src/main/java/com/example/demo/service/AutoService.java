package com.example.demo.service;

import com.example.demo.domain.Auto;
import com.example.demo.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.ArrayList;

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

    public ArrayList<String> watIsHet() {

        Class c =autoRepository.getClass();
        ArrayList<String> s = new ArrayList<>();
        s.add(c.toString());


        for (Method m : c.getDeclaredMethods())
        {
            s.add(m.toString());
        }
        return s;
//        return c.toString();
    }
}
