package array;

public class flawed {
    public static void main(String[] args){
        int [] numbers = {11, 42, -5, 27, 0, 89};
        for (int i = 0; i < numbers.length / 2; i ++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        for(int i = 0; i < numbers.length; i++){
        System.out.print(numbers[i] + " ");
        }
        }
    
}
