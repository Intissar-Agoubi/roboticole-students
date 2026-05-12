package org.roboticole.domain;

import java.util.AbstractList;

public class GetAllStudents {
    private StudentRepository studentRepository ;

    public GetAllStudents(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    AbstractList<StudentModel> execute (){
        return studentRepository.getAllStudent();
    }
}
