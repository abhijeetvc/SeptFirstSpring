package com.afternoonsept.SeptFirstSpring.controller;

import com.afternoonsept.SeptFirstSpring.impl.StuImpl;
import com.afternoonsept.SeptFirstSpring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by abhi on 10/09/17.
 */

@RestController
public class StuControl {

    @Autowired
    StuImpl s;

    @GetMapping(value="/getdata")
    Map<String,Object> data(){

        List<Student> l=s.getData();

        Map<String,Object> map=new HashMap<>();
        map.put("status","success");
        map.put("result",l);


        return map;
        }

        @PostMapping(value="/savedata")
        Map<String,Object> saveData(@RequestBody Student st){

            s.saveData(st);

            Map<String,Object> map=new HashMap<>();
            map.put("status","success");
            map.put("result","Data saved successfully");

            return map;
        }

        @PostMapping(value="/getimagedata")
        String getImageAndData(@RequestParam Integer id,
                               @RequestParam String name,
                               @RequestParam MultipartFile file){


            String imageName=file.getOriginalFilename();
            File f=new File("/Users/abhi/Desktop/image/"+imageName);

            String st1=f.getAbsolutePath();
            System.out.println(st1);
            Student s1=new Student();
            s1.setId(id);
            s1.setName(name);
            s1.setImagePath(imageName);

            try {
                file.transferTo(f);
            } catch (IOException e) {
                e.printStackTrace();
            }
            s.saveData(s1);


            return "data saved";
        }




    }

