package org.roboticole.domain;

import java.util.AbstractList;
import java.util.ArrayList;

public class GetAllStudentsUsecase {
    private StudentRepository studentRepository ;

    public GetAllStudentsUsecase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public ArrayList<StudentModel> execute(){
        return studentRepository.getAllStudent();
    }
}
