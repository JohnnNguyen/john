package pheptoan;
import java.util.Scanner;
public class Pheptoan {

    private static int o;
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int number1 = scanner.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int number2 = scanner.nextInt();
        int tong = number1 + number2;
        int hieu = number1 - number2;
        int tich = number1 * number2;
        int thuong = 0;
        int du = 0;
        if (number2 != 0){
            thuong = number1 / number2;
            du = number1 % number2;
        }else {
            System.out.println("khong the chia het cho 0");
        }
        System.out.println("ket qua cong: " + tong);
        System.out.println("ket qua tru: " + hieu);
        System.out.println("ket qua nhan: "+ tich);
        
        if(number2 !=o){
            System.out.println("ket qua chia: " + thuong);
            System.out.println("ket qua chia lay du: " + du);
        }            
    }    
}
