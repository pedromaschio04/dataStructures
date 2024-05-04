package dev.pedrohpmaschio.sort;
import java.util.Arrays;
public class BubbleSort {
    public static int[] sort(int[] numbers){
        int tmp;
        for(int i =0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]<numbers[i]){
                    tmp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=tmp;
                }
            }
        }
        return numbers;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{10,25,2,34,12,11,1,48};
        numbers = sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
