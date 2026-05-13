package org.roboticole.presentation;

import org.roboticole.date.StudentDataRepository;
import org.roboticole.date.StudentLocalDateSource;
import org.roboticole.date.StudentDataRepository;
import org.roboticole.date.StudentLocalDateSource;
import org.roboticole.domain.*;

import java.util.ArrayList;

public class StudentView {

    public static void funcion1() {
        printStudents();
        saveStudent();
        printStudents();
    }

    public static void funcion2() {
        printStudents();
    }

    public static void funcion3() {
        printStudents();
        deleteStudent("FF23");
        printStudents();
    }

    public static void printStudents() {
        GetAllStudentsUsecase getAllStudentsUseCase =
                new GetAllStudentsUsecase(new org.roboticole.date.StudentDataRepository(StudentLocalDateSource.getInstance()));

        ArrayList<StudentModel> students = getAllStudentsUseCase.execute();

        System.out.println("Students: " + students);
    }

    public static void saveStudent() {
        StudentModel studentModel =
                new StudentModel("Vicky", "Agoubi", 22, "22EEf", "DAM");

        SaveStudentUseCase saveStudentUseCase =
                new SaveStudentUseCase(new org.roboticole.date.StudentDataRepository(StudentLocalDateSource.getInstance()));

        saveStudentUseCase.execute(studentModel);
    }

    public static void deleteStudent(String id) {
        DeleteStudentUseCase deleteStudentUseCase =
                new DeleteStudentUseCase(new org.roboticole.date.StudentDataRepository(StudentLocalDateSource.getInstance()));

        deleteStudentUseCase.execute(id);
    }
}