package ch06.sec08;

public class PracticeMethod {
    public void abs (int num){
        System.out.println(num < 0 ? -num : num);
    }

    public int random  (int num){
        return (int)(Math.random()*num);

    }

    public int random (int num1, int num2){
        return (int)(Math.random()*(num2-num1) + num1);
    }
}
