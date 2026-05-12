package org.roboticole.date;

import org.roboticole.domain.StudentModel;
import org.roboticole.domain.StudentRepository;

import java.util.ArrayList;

public class StudentDataRepository  implements StudentRepository {
    private  StudentLocalDateSource studentLocalDateSource ;

    public StudentDataRepository(StudentLocalDateSource studentLocalDateSource) {
        this.studentLocalDateSource = studentLocalDateSource;
    }

    @Override
    public void saveStudent(StudentModel studentModel) {

    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public ArrayList<StudentModel> getAllStudent() {
        return null;
    }

    @Override
    public StudentModel getStudentById(String id) {
        return null;
    }
}
