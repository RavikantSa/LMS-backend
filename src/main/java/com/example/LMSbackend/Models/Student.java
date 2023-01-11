package com.example.LMSbackend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.*;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(nullable = false)
    private  String name;
    @Column(name="school_email" , unique = true , nullable = false)
    private String email;
    @Column(columnDefinition = "varchar(255) default 'India'")
    private  String country;
    private int age;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updateOn;
    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    private  Card card;

    public Student(String name, String email, String country, int age) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.age = age;
    }
}
