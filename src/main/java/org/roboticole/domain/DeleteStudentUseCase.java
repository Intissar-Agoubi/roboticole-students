package org.roboticole.domain;

public class DeleteStudentUseCase {
    private StudentRepository studentRepository ;

    public DeleteStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    void execute(String id ){
        studentRepository.deleteStudent(id);
    }
}
