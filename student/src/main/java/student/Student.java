package student;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

interface IPerson {
    void displayInfo();
}
abstract class Person {
    private String id;
    private String fullName;
    private Date dateOfBirth;

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public abstract void displayInfo();
}
class Student extends Person implements IPerson {
    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}
class StudentList {
    private ArrayList<Student> studentList;
    public StudentList() {
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void updateStudentById(String id, Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.set(i, updatedStudent);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }
    public Student findStudentByID(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println();
        }
    }
    public Student findTopStudent() {
        if (studentList.isEmpty()) return null;

        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}

