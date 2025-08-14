package java_hw_7.task2;

import java.util.List;

public class Student {

    private int id;

    private String name;

    private int age;

    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public static List<Student> addStudent(List<Student> students, Student student){
        students.add(student);
        return students;
    }

    public static List<Student> removeStudentById(List<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id){
                students.remove(i);
                break;
            }
        }
        return students;
    }

    public static Student findStudentByName(List<Student> students, String name){
        for (Student student : students){
            if (student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        System.out.println("There is no such student on the list.");
        return null;
    }

    public static void printAllStudents(List<Student> students){
        if (students.isEmpty()){
            System.out.println("The list is empty");
        }
        else {
            for (Student student : students){
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
