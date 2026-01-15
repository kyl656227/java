package ch05.sec05;

import java.util.Arrays;

public class ArrayRandom {
    public static void main(String[] args ){
        int rVal = (int)(Math.random()*9)+1;
        System.out.println("rVal:" + rVal);

        int[] arr = new int[9];

        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*9)+1;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------");

        // 중복되지 않는 배열 만들기

        int[] arr2 = new int[9];
        for(int i=0; i<arr.length; i++){
            arr2[i]=(int)(Math.random()*9)+1;
            for(int k=0; k<i; k++){
                if(arr2[k] == arr2[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
