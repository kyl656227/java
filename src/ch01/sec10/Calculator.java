package ch01.sec10;
/*
primitive type (원시타입/일반타입) 자바에 8개 존재
정수형 : byte, short (얘네도 거의안씀)
int, long (int가 저장할수없는 범위일때 가끔 long)
실수형 : float, double
불린형: boolean (거의
문자형: char (사용 안함
 */

public class Calculator {
    public static void main(String[]args){
        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println(result);
    }
}
