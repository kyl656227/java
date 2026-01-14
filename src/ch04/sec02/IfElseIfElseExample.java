package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[]args){
        int score = (int)(Math.random()*81.0)+20; // 20~100 사이 랜덤값

        String result = "D";

        if (score >= 90 ) {
            result = "A";
        } else if( score >=80 ) {
            result = "B";
        } else if ( score >= 70 ){
            result = "C";
        }
        System.out.printf
        ("score: %d \nresult: %s", score, result);
    }
}
