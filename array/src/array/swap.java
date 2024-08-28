package array;

import java.util.Arrays;

public class swap {
    public static void main(String[] args){ 
        int [] a1 = {12, 34, 56};
        int [] a2 = {20, 50, 80};
        swapAll(a1, a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        }

    private static void swapAll(int[] a1, int[] a2) {
        for (int i = 0;i < a1.length; i++){
            int temp = a1[i];
            a1[i] = a2[i];
            a2[i] = temp;
    }
    
    }
}

