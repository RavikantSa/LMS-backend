package com.example.LMSbackend.Service;

import com.example.LMSbackend.Controllers.StudentController;
import com.example.LMSbackend.Convertors.AuthorConvertor;
import com.example.LMSbackend.Convertors.StudentConvertor;
import com.example.LMSbackend.Models.Student;
import com.example.LMSbackend.Repository.StudentRepository;
import com.example.LMSbackend.RequestDto.StudentRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CardService cardService;
    public  String createStudent(StudentRequestDto studentRequestDto){
/*
        //Convert the Dto to entity
        Student s = new Student();
        s.setAge(studentRequestDto.getAge());
        s.setCountry(studentRequestDto.getCountry());
        s.setEmail(studentRequestDto.getEmail());
        s.setName(studentRequestDto.getName());

        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(s);  // for that new FK coloum

        // for that bideractional relation
        s.setCard(newCard);

        studentRepository.save(s);

        return "Successfully added student and card";
        */
        try{
            Student student = StudentConvertor.convertDtoToEntity(studentRequestDto);
            studentRepository.save(student);

        }catch (Exception e){
//            @Slf4j  --> log.info("createAuthor has coursed an error");
            log.info("createStudent has coursed an error");
            return "Student not created";
        }
        return " Student created Successfully";


    }


}
