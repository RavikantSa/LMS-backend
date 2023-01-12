package com.example.LMSbackend.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AuthorRequestDto {
    private  String name;
    private  String country;
    private  int age;
    @Column(unique = true)
    private String email;
}
