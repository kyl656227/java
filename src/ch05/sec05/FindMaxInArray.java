package ch05.sec05;

public class FindMaxInArray {
    public static void main(String[] args){
        int[] arr = {10,8,88,1,100,14};
        int max = arr[0];
        for(int i= 1; i < arr.length; i++){
            if (arr[i] > max ){
                max=arr[i];

            }
        }
        System.out.print("max:" + max);
    }
}
