package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[]args){
        int x = 3;
        int y = 5;
        //-----[start]
        int a = x;
        x = y;
        y = a;
        //-----[end]

        System.out.println("x:" + x + ", y: " + y);
        System.out.printf("x: %d, y: %d\n", x, y); //d는 정수, f는 실수 b는 불린
    }
}
