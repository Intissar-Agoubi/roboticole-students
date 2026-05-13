package org.roboticole.domain;

public class GetStudentByIdUseCase {
    private  StudentRepository studentRepository ;

    public GetStudentByIdUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public StudentModel execute(String id ){
        return studentRepository.getStudentById(id);
    }
}
