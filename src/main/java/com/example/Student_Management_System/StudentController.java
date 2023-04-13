package com.example.Student_Management_System;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController // In this class we will be writing API end points
public class StudentController {
    HashMap<Integer,Student> map=new HashMap<>();
    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){
        int key=student.getRollNo();
        map.put(key,student);
    }

    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo")Integer rollNo){
        Student student=map.get(rollNo);
        return student;
    }
}
