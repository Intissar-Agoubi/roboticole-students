package org.roboticole.date;

import org.roboticole.domain.StudentModel;

import java.util.ArrayList;
import java.util.Objects;

public class StudentLocalDateSource {
    private static StudentLocalDateSource instance = null;

    public StudentLocalDateSource() {
    }

    private ArrayList<StudentModel> storage = new ArrayList<>();

    public void saveStudent(StudentModel studentModel) {
        storage.add(studentModel);
    }

    private void deletStudent(String id) {
        storage.removeIf(studentModel -> Objects.equals(studentModel.getId(), id));
    }

    private ArrayList<StudentModel> getAllStudent() {
        return storage;
    }

    private StudentModel getStudentById(String id) {
        for (StudentModel studentModel : storage) {
            if (studentModel.getId() == id) {
                return studentModel;
            }
        }
        return null ;
    }
    public static StudentLocalDateSource getInstance(){
        if (instance== null){
            instance = new StudentLocalDateSource();
        }
        return instance ;
    }
}
