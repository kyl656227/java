package ch05.sec03;

public class StringMethod2 {
    public static void main(String[] args) {
        // 문자열 잘라내기 substring 메소드이용, 방법 2가지
        // 첫번째, 아규먼트 1개(정수) 이용, 정수(index)문자부터 마지막 문자열까지 잘라냄
        String oldStr1 = "abcdefghijklmnopqrstu";
        String newStr1 = oldStr1.substring(10);
        System.out.println("oldStr1:" + oldStr1);
        System.out.println("newStr1:" + newStr1);

        // 두번째, 아규먼트 2개 (둘 다 정수) 이용.
        // 둘 다 index값인데 시작index, 종료index인데 그 앞 문자까지 자름.
        String newStr2 = oldStr1.substring(10, 13);
        System.out.println("newStr2:" + newStr2);

        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6);
        System.out.println("fistNum:" + firstNum);

        String secondNum = ssn.substring(7);
        System.out.println("secondNum:" + secondNum);

        // 문자열 안에서 문자열 찾기, -1은 그런 문자열 없다
        // 찾으면 첫번째 문자의 idx값을 리턴한다.
        int idx = oldStr1.indexOf("hi");
        System.out.println("idx:" + idx);

        int idx2 = ssn.indexOf("5");
        System.out.println("idx2:" + idx2);

        int idx3 = ssn.lastIndexOf("5");
        System.out.println("idx3:" + idx3);

        // 문자열 포함되어있는지 찾을때, contains도 사용가능
        if (ssn.contains("88")) {
            System.out.println("ssn에 88이 있음");
            } else{
                System.out.println("ssn에 88이 없음");
            }
        }
    }
