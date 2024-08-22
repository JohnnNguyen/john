package assignments3;
import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = scanner.nextLine();   
        System.out.println("enter your age: ");
        int age = scanner.nextInt();
        System.out.println("enter your sex: ");
        String sex = scanner.next();
        scanner.nextLine();
        System.out.println("enter your major: ");
        String major = scanner.nextLine();
        System.out.println("enter your GPA: ");
        float GPA = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("enter your country: ");
        String country = scanner.nextLine();
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("Country: " + country);
    }
    
}
    