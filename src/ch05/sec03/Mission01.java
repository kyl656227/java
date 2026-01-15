package ch05.sec03;

public class Mission01 {
    public static void main (String[]args){
        String fileNm = "abcdfs12-jjk-bbb.kkk.adobe";



        int a = fileNm.lastIndexOf(".");
        String newStr1 = fileNm.substring(a + 1);
        System.out.println("newStr:" + newStr1);

    }
}
