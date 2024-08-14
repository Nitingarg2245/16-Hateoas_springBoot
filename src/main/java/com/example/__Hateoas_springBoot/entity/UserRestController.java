package com.example.__Hateoas_springBoot.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserRestController {
    @GetMapping("/student")
    public Student getStudent(){
        Student student=new Student(1012,"vishal",26);
        student.add(linkTo(methodOn(UserRestController.class).getStudent()).withSelfRel());
        return student;
    }
}
