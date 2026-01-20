package ch06.sec09;

public class Car {
    String model;
    int speed;

    public Car(){
        this("소나타"); //생성자에서 다른 생성자 호출할때 이렇게 씀
    }

    public Car(String name) {
        this.model = name;
        this.introduce(); //속성이나 메소드를 값 넣거나 가져와서 읽기할때 this.를 쓴다.

    }

    public void introduce(){
        System.out.printf("모델명: %s\n", this.model); //메소드 호출하고싶을때도 쓴다.
    }


}
