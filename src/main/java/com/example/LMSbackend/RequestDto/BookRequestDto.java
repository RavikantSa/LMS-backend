package com.example.LMSbackend.RequestDto;

import com.example.LMSbackend.Enums.Genre;
import com.example.LMSbackend.Models.Author;

public class BookRequestDto {
    private String name;
    private Genre genre;
    private int authorId;
}
