package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int numbers[] = new int[8];
        System.out.println("Mang ban dau");
        for (int i = 0;i < 8; i++){
            System.out.println(numbers[i] + "");
            numbers[i] = i * 2;            
        }
        System.out.println("Mang sau khi doi");
        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < 8; i++){
//            System.out.print(number[i]+ "");
//        }
    }    

    static String toString(int[] e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
