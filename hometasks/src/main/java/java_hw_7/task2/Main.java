package java_hw_7.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student bohdan = new Student(64556, "Bohdan", 20, 10.5);
        Student oleksandr = new Student(64326, "Oleksandr", 21, 11.6);
        Student anton = new Student(74556, "Anton", 20, 11.2);
        Student arkadii = new Student(566855, "Arkadii", 21, 9.5);
        Student mahmed = new Student(6565, "Mahmed", 15, 10.9);
        Student.addStudent(students, bohdan);
        Student.addStudent(students, oleksandr);
        Student.addStudent(students, anton);
        Student.addStudent(students, arkadii);
        Student.addStudent(students, mahmed);

        Student.printAllStudents(students);

        Student.removeStudentById(students, 64556);

        Student.printAllStudents(students);

        Student.findStudentByName(students, "Vasya");
    }
}
