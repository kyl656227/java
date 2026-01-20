package ch07.sec08;

public class AnimalMain2 {
    /* 대전제3 DEEP
    메소드 호출은 타입이 알고 있는 메소드만 호출할 수 있고,
    호출이 되면 객체 기준에서 메소드를 찾는다.ㅣ
    Dog  클래스에 새로운 메소드 jump()추가

     */
    public static void main(String[] args){
        Animal animals = new Dog(); //Dog 객체는 jump 매체를 가지고 ㅣㅇㅆ음
        animals.crying(); //알고 있어서 호출 o
        //animals.jump(); // 몰라서 호출 x (animals입장에서)

        if(animals instanceof Dog) {
            Dog dog = (Dog) animals; //같은 타입으로 (Dog) 강제형변환
            dog.jump();
        }
        /* instanceof
        변수에 담겨져 있는 객체를 타입에 담을 수 있으면 true , 없으면 false 리턴
        왼쪽이 변수 우측이 타입
         */
        System.out.println(animals instanceof Dog);
    }

}
