package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args){
        Person p = new Person();
        //Calcualble을 implements한 객체 주소값을 action 메소드에 아규먼트로 보내줌
        // 10.0 , 12.2 계산은 더하기

        // Calculable c = (double x, double y) -> x + y;
        // p.action(c, double x, double y)
        p.action((double x, double y) -> x + y,10.0,12.2); //한 줄로
        p.action((double x, double y) -> x * y,10.0,12.2); //한 줄로

    }
}
