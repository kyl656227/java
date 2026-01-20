package ch07.sec08;
/*
멤버필드는 어짜피 pivate으로 은닉화
메소드에만 집중하면됨

대전제 3가지
1. 부모타입의 변수는 자식 객체 주소값 담을 수 있다.
2. 자식타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 메소드 호출은 타입이 알고 있는 메소드만 호출할 수 있고
    호출이 되면 객체 기준에서 메소드를 찾는다.
 */

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }



}
