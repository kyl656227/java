package ch04.sec02;

public class IfElseIfElseExample2 {
    public static void main(String[]args){
        int score = (int)(Math.random()*81.0)+20; // 20~100 사이 랜덤값
        String result = "A";
        if (score < 70) {
            result = "D";
        } else if (score < 80 ){
            result = "C";
        } else if ( score < 90 ){
            result ="B";
        }
        System.out.printf("score: %d \nresult: %s" , score, result );
    }
}
