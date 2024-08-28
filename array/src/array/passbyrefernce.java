package array;
import java.util.Arrays;
public class passbyrefernce {
    public static void main(String[] args){
        int[] iq = {126, 167, 95};
        increase(iq);
        System.out.println(Arrays.toString(iq));
    }

    private static void increase(int[] a) {
        for (int i = 0; i < a.length; i++){
            a[i] = a[i] * 2;
        }
    }
    
}
