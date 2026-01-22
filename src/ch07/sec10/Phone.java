package ch07.sec10;
/*
 추상 클래스란 class 키워드 앞에 abstract 들어간 클래스를 의미.
 추상 클래스는 부모 역할만 한다. (나 그 메소드 안다 내용은 모름)
 특징 :
 -객체화가 안됨 new a () 이런거 못만듦.
 -추상메소드가 있으면 클래스는 무조건 추상 클래스가 되어야한다.

 */
public abstract class Phone {
    //멤버필드 가질 수 있음
    private String owner;

    // 추상메소드 : 구현부 없고 선언부만 있는 메소드를 의미
    // 나는 이 메소드가 있다는 걸 알고있다 -> 자식들에게
    // 추상메소드는 강제성이 있다. 자식은 무조건 오버라이딩 해야한다.
    public abstract void bell();

    // 일반 메소드도 가질 수 있다.
    public void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
}
