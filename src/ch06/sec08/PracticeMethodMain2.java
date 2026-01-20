package ch06.sec08;

import java.util.Arrays;

public class PracticeMethodMain2 {
    public static void main(String [] args){
        PracticeMethod2 pm = new PracticeMethod2();

        String randomFileName = pm.getRandomFileName();
        System.out.println("randomFileName:" + randomFileName);

        String originalFileName = "하이하이하이/hihihi.lolololol.jpg";
        String ext = pm.getExt(originalFileName);
        System.out.println(""+ext);

        String rFileName2 = pm.getRandomFileName(originalFileName);
        System.out.println("랜덤파일+확장자명: " + rFileName2);
        System.out.println("랜덤파일+확장자명2: " + rFileName2);

        int[] arr = { 10, 5, 8, 11, };
        int sum = pm.sumArr(arr); //배열의 모든 값 더한 뒤 리턴
        System.out.println("sum:" + sum);

        int[] arr2 = pm.deepCopy(arr);
        System.out.println("deepcopy:" + Arrays.toString(arr2));

        int max = pm.getMax(arr);
        System.out.println("max:"+ max);

        int min = pm.getMin(arr);
        System.out.println("min:"+ min);



    }
}
