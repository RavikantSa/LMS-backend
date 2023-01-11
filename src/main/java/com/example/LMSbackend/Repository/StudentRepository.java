package com.example.LMSbackend.Repository;

import com.example.LMSbackend.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}

