package ch05.sec03;

public class NullPointerExceptionExample {
    public static void main(String[] args ){
        int[] arr = null; //null은 주소값 없다는 의미

        // int len = arr.length; //NPE 발생, 가리키는 객체가 없는데
        // 속성값 읽기 혹은 메소드 호출하면 예외 발생함.

        String input = null;

        //이렇게 쓰면 false라고만 뜨지만 위치를 바꾸면(input.equals(3)) NPE뜸 input이 null이니까
        // 문자형 값 비교는 equals !!
        if("3".equals(input)) {
            System.out.println("정지");
        }
        System.out.println("끝");
    }
}
