package ch04.sec02;

import java.util.Scanner;

public class KeyControlExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;

        while(true) {
            System.out.println("-------------");
            System.out.println("1.증속 | 2. 강속 | 3. 중지");
            System.out.println("-------------");
            System.out.println("선택:");
            String choice = scanner.nextLine();
            // "3" 문자열이 들어오면 반복문 종료
            // "1" 문자열이 들어오면 speed증가
            // "2" 문자열이 들어오면 speed감소

            if("3".equals(choice)) { //이렇게 쓰는게 에러 안터짐
                break;
            } else if("1".equals(choice)) {
                speed ++;
            } else if ("2".equals(choice)) {
                speed --;
            }
            System.out.println("speed:" + speed);

        }
        System.out.println("--done--");
    }
}
