package Methodd;
import java.util.ArrayList;
import java.util.Scanner;

public class Methodd {    
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }
    public static void printData(float[] arrays) {
        System.out.print("Mảng: ");
        for (float value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static float findMax2(float[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mảng không đủ phần tử để tìm giá trị lớn thứ 2");
            return -1;
        }

        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;

        for (float value : arrays) {
            if (value > max1) {
                max2 = max1;
                max1 = value;
            } else if (value > max2 && value != max1) {
                max2 = value;
            }
        }

        if (max2 == Float.NEGATIVE_INFINITY) {
            System.out.println("Không có giá trị lớn thứ 2 trong mảng");
            return -1;
        }
        return max2;
    }
    public static float[] deleteOddNumber(float[] arrays) {
        ArrayList<Float> resultList = new ArrayList<>();
        
        for (float value : arrays) {
            if (value % 2 == 0) {
                resultList.add(value);
            }
        }
        float[] resultArray = new float[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        float[] arrays = new float[n];
        arrays = importData(arrays);
        printData(arrays);
        float max2 = findMax2(arrays);
        if (max2 != -1) {
            System.out.println("Giá trị lớn thứ 2 trong mảng: " + max2);
        }
        arrays = deleteOddNumber(arrays);
        System.out.println("Mảng sau khi xoá các phần tử lẻ:");
        printData(arrays);
    }
}
