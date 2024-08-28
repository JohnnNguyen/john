package array;
import java.util.Scanner;
import java.util.Arrays;
public class thoitiet2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("how many days' temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++){
            System.out.print("Day" + (i+1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];           
        }
        double average = (double) sum/days;
        int count = 0;
        for (int i = 0;i < days;i++){
            if (temps[i] > average){
                count++;
            }
        }
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + "days above average");
        System.out.println("temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        if(days >= 2){
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 1]+ ", " + temps[temps.length -2]);        
        }else if (days == 1){
            System.out.println("only one temperatures recorded: " + temps[0]);
        }
        }    
}
