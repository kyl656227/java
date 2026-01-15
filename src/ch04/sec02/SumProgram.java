package ch04.sec02;

import java.util.Scanner;

/*
 숫자를 입력해 주세요 (종료:0)
 */

public class SumProgram {
    public static void main(String[] argus){
        Scanner scanner = new Scanner(System.in); // 키보드에서 값을 입력받기 위한 도구
        int sum = 0; // 값 저장할 바구니

        while(true) {
            System.out.print("숫자를 입력해 주세요:");
            int data = scanner.nextInt(); //숫자 하나 입력받음

            if(data == 0) {
                break; //0이면 반복문 탈출
            } else {
                sum = sum + data; //0아니면 sum 바구니에 입력받은 숫자 더함

            }


        }
        System.out.println("sum:"+sum);

    }
}  //equals 는 문자열에만 쓸 수 있음.
   // int는 기본 타입(Primitive Type)이고, .equals()는 객체(Object)에서만 쓸 수 있는 기능

/*
public class SumProgramResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("숫자를 입력해 주세요 (종료: 0) >> ");
            try {
                int input = scanner.nextInt();
                if(input == 0) { break; }
                sum += input;
            } catch (Exception e) {
                System.out.println("숫자만 입력해 주세요.");
                scanner.nextLine(); //nextInt() 개행이 남아 있어서 개행 제거용
            }
        }
        System.out.println("합계: " + sum);
    }
}
*/
