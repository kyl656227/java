package ch07.sec08;

public class AnimalMain {
    public static void main(String[] args){
        //1 Animals 객체 주소값을 담을 수 있는 animlas 변수 + Animals 자식 객체의 주소값도 가능.
        Animal animals = new Dog();

        // Dog타입의 변수로 BullDog 객체 주소값 담을 수 있나?
        Dog dog = new BullDog();
        dog.crying();

        // 대전제 2번 내용
        //Dog dog2 = new Animals(); //컴파일 에러 뜸
        //Dog dog2 = (Dog)(new Animal()); // 강제 형변환 해도 안된다. 대전제 2번 위반
        Dog dog3 = (Dog)animals; //animals 변수에는 Dog객체 주소값이 담겨져 있어서
        // Dog타입 변수에 주소값 담을 수 있다.

        Dog dog4 = new Dog();

        // 대전제 3번 내용 찾아서 없으면 객체 기준으로 부모를 타고 올라가서
        // 가장 빨리 만나는 메소드가 실행 됨
        animals.crying();

        System.out.println("끝");
    }
}
