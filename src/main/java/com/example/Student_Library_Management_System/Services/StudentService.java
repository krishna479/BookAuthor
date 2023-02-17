package com.example.Student_Library_Management_System.Services;

import com.example.Student_Library_Management_System.Enums.CardStatus;

import com.example.Student_Library_Management_System.Models.Card;
import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public String createStudent( Student student){
        Card card =new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudentVariableName(student);
        student.setCard(card);
        studentRepository.save(student);
        return "Addition of Student and card successful";
    }


}
