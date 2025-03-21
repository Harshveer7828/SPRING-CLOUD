package com.springsecurity.spring_security.controller;

import com.springsecurity.spring_security.model.Student;
import com.springsecurity.spring_security.model.Users;
import com.springsecurity.spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private UserRepository userRepository;

    private List<Student> students = List.of(
            new Student(1,"Harsh veer singh",22),
            new Student(2,"Rajesh",20)
    );

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student newStudent){
        students.add(newStudent);
        return newStudent;
    }

    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users users){
        userRepository.save(users);
        return users;
    }


}
