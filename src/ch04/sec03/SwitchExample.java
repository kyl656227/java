package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;

        System.out.println("num:" + num);

        switch (num) {
            case 1:
            case 3:
            case 5:
                System.out.println("홀");
                break;
            default:
                System.out.println("짝");
                break;
        }
    }
}
