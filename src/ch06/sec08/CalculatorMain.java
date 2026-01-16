package ch06.sec08;

public class CalculatorMain {
    public static void main(String [] args){
        // Calculator 객체화 해라.
        Calculator cal = new Calculator();
        cal.powerOn();
        cal.powerOff();
        int result = cal.plus(10,20);
        System.out.println("System:" + result);

        int n1 = 10, n2 = 3;
        double result2 = cal.divide(10, 3);
        System.out.println("result2:" + result2);

    }
}
