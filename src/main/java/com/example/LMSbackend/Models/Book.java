package com.example.LMSbackend.Models;

import com.example.LMSbackend.Enums.Genre;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private  Author author;

    @ManyToOne
    @JoinColumn
    private  Card card;
}
