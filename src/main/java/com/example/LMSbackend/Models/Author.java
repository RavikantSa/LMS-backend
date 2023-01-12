package com.example.LMSbackend.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String name;
    private  String country;
    private  int age;
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL) // mapped by child name of FK
    private List<Book> bookWritten;


}
