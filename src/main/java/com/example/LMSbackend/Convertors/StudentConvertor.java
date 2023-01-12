package com.example.LMSbackend.Convertors;


import com.example.LMSbackend.Models.Student;
import com.example.LMSbackend.RequestDto.StudentRequestDto;

public class StudentConvertor {

    public static Student convertDtoToEntity(StudentRequestDto studentRequestDto){

        return Student.builder().
                name(studentRequestDto.getName()).
                age(studentRequestDto.getAge()).
                country(studentRequestDto.getCountry()).
                email(studentRequestDto.getEmail()).
                build();
           /*
           Student student = Student.builder().
                name(studentRequestDto.getName()).
                age(studentRequestDto.getAge()).
                country(studentRequestDto.getCountry()).
                email(studentRequestDto.getEmail()).
                build();
        return  student;
         */
    }
}
