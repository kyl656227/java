package ch07.sec02;
// 상속 + 생성자 마무리
// Phone 클래스를 상속 받고 싶다면 extends라는 키워드를 사용해야함
public class SmartPhone extends Phone {

    private boolean wifi; //전역변수 boolean타입은 디폴트값이 fault

    //기본 생성자 생성
    public SmartPhone(String model, String color) {
        // super(); 부모가 기본생성자가 없어서 에러가 발생함
        super(model, color); // 기본생성자 없이 있는 생성자 넣음

    }

    public void toggleWifi() {
        // 값을 바꾼다.
        wifi = !wifi;
        System.out.println("wifi:" + wifi);
    }

    /* p.295
    메소드 오버라이딩은 부모가 가지고 있는 메소드를
    다시 정의하는 것을 얘기함 => 메소드 재 정의
    @Override 에노테이션을 붙여준다. (실수 방지용)
    부모가 가지고 있지 않은 메소드를 정의하면 새로운 메소드 추가임
    그럴때 @Override에 빨간줄 쳐짐 그래서 실수방지용 ㅇㅇ
    -> 부모에 그 메소드가 없다고 알려주는것
     */
    @Override
    public void bell() {
        super.bell(); //부모가 가진 내용
        System.out.println("스마트폰 진동과 벨이 울린다."); //부모가 가진 내용과 다르게 해봄
    }

}
