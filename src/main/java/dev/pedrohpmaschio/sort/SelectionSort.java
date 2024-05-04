package dev.pedrohpmaschio.sort;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] numbers){

        for(int i=0;i<numbers.length;i++){
            int lowerIndex=i,tmp;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]<numbers[lowerIndex]){
                    lowerIndex = j;
                }
            }
            tmp = numbers[i];
            numbers[i] = numbers[lowerIndex];
            numbers[lowerIndex] = tmp;
        }
        return numbers;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{10,25,2,34,12,11,1,48};
        System.out.println(Arrays.toString(sort(numbers)));
    }
}
