
package assignments3;
import java.util.Scanner;
public class baitap3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mot ki tu: ");
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("ky tu nhap vao la mot so nguyen: " + number );
        }else{
            System.out.println("ky tu nhap vao khong phai la so nguyen");
        }
    }
    
    
}
