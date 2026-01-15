package ch05.sec05;

public class MultiArray {
    /* 다차원 배열 (2차원 배열)
        배열 안에 배열이 있는 것

         */
    public static void main(String[] argus) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 110, 120}
        };
        System.out.println("arr.length:" + arr.length);
        System.out.println("arr[0].length:" + arr[0].length);
        System.out.println("arr[0][0]:" + arr[0][0]);
        int[] temp = arr[0];
        System.out.println("temp[0]:" + temp[0]);
        System.out.println("arr[2][1]:" + arr[2][1]);
        //int[] arr2 = arr[0];
        System.out.println("-----------");

        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a <arr[i].length; a++) {
                System.out.println("arr:" + arr[i][a]);
            }

        }
        System.out.println();
    }
}
