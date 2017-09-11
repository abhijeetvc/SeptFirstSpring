package com.afternoonsept.SeptFirstSpring.controller;

import com.afternoonsept.SeptFirstSpring.impl.StuImpl;
import com.afternoonsept.SeptFirstSpring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by abhi on 10/09/17.
 */

@RestController
public class StuControl {

    @Autowired
    StuImpl s;

    @GetMapping(value="/getdata")
    List<Student> data(){

        List<Student> l=s.getData();

            return l;
        }
    }

