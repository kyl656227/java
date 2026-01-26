package ch04.sec03;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {
        String grade = "vip"; // vip, gold, noraml
        String grade1 = "gold"; // vip, gold, noraml
        String grade2 = "normal"; // vip, gold, noraml
        /*
        vip는 가격의 10% 할인 가격
        gold는 가격의 5% 할인 가격
        normal은 할인 없는 원래 가격
         */
        int price = 10_000;
        int byPrice = switch (grade1) {
            case "vip" -> {
                int a = (int)(price*0.1);
                yield a;
            }
            case "gold" -> {
                int b = (int)(price*0.05);
                yield b;
            }
            default -> price;
        };
        System.out.println("buyPrice: " + byPrice);
    }
}