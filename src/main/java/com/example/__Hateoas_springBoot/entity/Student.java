package com.example.__Hateoas_springBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends RepresentationModel<Student> {
    int id;
    String name;
    int age;
}
