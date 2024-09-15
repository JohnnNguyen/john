package student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Processor {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by ID");
            System.out.println("3. Delete a student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addStudent(scanner, studentList);
                    break;
                case 2:
                    updateStudent(scanner, studentList);
                    break;
                case 3:
                    deleteStudent(scanner, studentList);
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    findTopStudent(studentList);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    private static void addStudent(Scanner scanner, StudentList studentList) {
        System.out.println("Enter ID:");
        String id = scanner.nextLine();
        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter Date of Birth (yyyy-MM-dd):");
        Date dateOfBirth = parseDate(scanner.nextLine());
        System.out.println("Enter GPA:");
        float gpa = scanner.nextFloat();
        scanner.nextLine(); 
        System.out.println("Enter Major:");
        String major = scanner.nextLine();
        Student student = new Student(id, fullName, dateOfBirth, gpa, major);
        studentList.addStudent(student);
    }
    private static void updateStudent(Scanner scanner, StudentList studentList) {
        System.out.println("Enter ID of student to update:");
        String id = scanner.nextLine();
        Student existingStudent = studentList.findStudentByID(id);
        if (existingStudent != null) {
            System.out.println("Enter new Full Name:");
            String newFullName = scanner.nextLine();
            System.out.println("Enter new Date of Birth (yyyy-MM-dd):");
            Date newDateOfBirth = parseDate(scanner.nextLine());
            System.out.println("Enter new GPA:");
            float newGpa = scanner.nextFloat();
            scanner.nextLine(); 
            System.out.println("Enter new Major:");
            String newMajor = scanner.nextLine();
            Student updatedStudent = new Student(id, newFullName, newDateOfBirth, newGpa, newMajor);
            studentList.updateStudentById(id, updatedStudent);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    private static void deleteStudent(Scanner scanner, StudentList studentList) {
        System.out.println("Enter ID of student to delete:");
        String id = scanner.nextLine();
        studentList.deleteStudentById(id);
    }
    private static void findTopStudent(StudentList studentList) {
        Student topStudent = studentList.findTopStudent();
        if (topStudent != null) {
            System.out.println("Top Student:");
            topStudent.displayInfo();
        } else {
            System.out.println("No students available.");
        }
    }
    private static Date parseDate(String dateStr) {
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Using current date.");
            return new Date();
        }
    }
}
