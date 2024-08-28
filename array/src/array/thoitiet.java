package array;
import java.util.Scanner;
public class thoitiet {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("how may days temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for(int i = 0;i < days ; i++){
            System.out.println("Day"+  (i+1) + "'s high temp: ");
            sum += temps[i];
        }
        double average = (double) sum/days;
        int count = 0;
        for (int i = 0;i < days; i++){
            if(temps[i] > average){
                count++;
            }
        }
        System.out.printf("Average temp = %.1f",average);
        System.out.println();
        System.out.println(count + " days above average");                    
    }
}
