package ch05.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        System.out.println("args[0]:" + args[0]);

        // 숫자가 역할을 하면 매직넘버라고 부르며 보통 상수/변수로 관리한다.
        // '중복 없는' 3개의 랜덤 숫자
        final int COUNT = args.length == 1 ? Integer.parseInt(args[0]) : 3;
        //자바에서 상수 만들때 Final 붙이면 됨
        System.out.printf("--------숫자 야구 게임 (%d)-----------\n", COUNT);
        Scanner scanner = new Scanner(System.in); // 입력을 받을 준비

        //맞춰야되는 숫자들 숫자 담을 3칸 짜리 배열
        int[] questions = new int[COUNT];

        //questions에 중복되지 않는 숫자를 배열의 길이만큼 채워야 함.

        for (int i = 0; i < questions.length; i++) {
            questions[i] = (int) (Math.random() * 9) + 1; //1~9 랜덤숫자
            for (int k = 0; k < i; k++) { // 중복 검사 시작
                if (questions[k] == questions[i]) { // 새로 뽑은게[k] 이전것과[i] 같으면
                    i--; // i를 한 순서 뒤로 back. 같은 숫자를 계속 뽑으면 1번 순서에서 계속 도는것임
                    break; // 나가서 새 숫자 다시 뽑음.
                }
            }
        }
//        System.out.println(Arrays.toString(questions));
        int tryCount = 0;
        while (true) {
            tryCount++;
            // 숫자 3개를 입력 받을거임
            System.out.print("answer:");
            String answer = scanner.nextLine();
            System.out.println(answer);

            //answer 문자열을 이용하여 " " 기준으로 값들을 쪼개서 배열로 만들기
            String[] strAnswers = answer.split(" ");

            int[] answers = new int[strAnswers.length];
            for (int i = 0; i < strAnswers.length; i++) {
                answers[i] = Integer.parseInt(strAnswers[i]);
            }
//        System.out.println(Arrays.toString(answers));

            int s = 0, b = 0;
            for (int i = 0; i < questions.length; i++) {
                for (int k = 0; k < answers.length; k++) {
                    if (questions[i] == answers[k]) {
                        if (i == k) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            System.out.printf("S: %d, B: %d, O: %d\n", s, b, (COUNT - (s + b)));


            //while 문을 빠져나가야 하는 조건

            if (s == COUNT) { //처음엔 리터럴 3을 썼는데, 이미 위에서 정해놨기 때문에 COUNT만 써 주면 됨
                break;
            }
        }
        System.out.printf("시도횟수: %d", tryCount );
    }
}