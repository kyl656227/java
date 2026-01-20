package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {
    public String getRandomFileName() {
        return UUID.randomUUID().toString(); // 중복없는 랜덤값

    }

    public String getExt (String filename ) {
        int idx = filename.lastIndexOf(".");
        String ext = filename.substring(idx);
        return ext;
    }

    public String getRandomFileName(String fileName){
        String ext = getRandomFileName() + getExt(fileName);
        return ext;
    }

    public int sumArr ( int[] newsum) {
        int sum = 0;
        for(int i=0; i<newsum.length; i++){
            sum = sum + newsum[i]; // sum += newsum[i];
        }
        return sum;
    }

    public int[] deepCopy( int[] arr){
        int[] Newarr = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            Newarr[i] = arr[i];
        }
        return Newarr;
    }

    public int getMax( int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if ( max < arr[i]){
                max = arr[i];
            }

        }
        return max;
    }

    public int getMin( int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if ( min > arr[i]){
                min = arr[i];
            }

        }
        return min;
    }


}
