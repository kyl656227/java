package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        // 스위치 표현식 : 결과값을 리턴해야할 때 좋음.
        // 스위치 표현식은 default 필수임!! (나머지값)
        int num = (int) (Math.random() * 13) + 1;
        System.out.println("num: " + num);
        String denomination = switch (num) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> {
                int a = 10;
                int b = 20;
                yield "Q"; // return이라는 뜻.여러줄의 연산을 쓴다면 yield라는 키워드로 리턴해줘야함
            }
            case 13 -> "K";
            default -> String.valueOf(num);
            // default -> num + ""; //정수에서 문자열 자동형변환
        };
        System.out.println("denomination: " + denomination);
    }
}
