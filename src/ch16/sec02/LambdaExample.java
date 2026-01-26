package ch16.sec02;

public class LambdaExample {
    public static void main(String[] args) {
        Person p = new Person();


       // action을 호출하면서 workable을 implement한 객체 주소값을 전달해라

        Workable work = new Workable() {
            @Override
            public void work() {

            }
        };

        // 1 이름 있는 클래스 이용
        Workable w1 = new Mechanic();
        p.action(w1);

        // 2 익명클래스 이용(일회용)
        Workable w2 = new Workable() {
            @Override
            public void work() {
                System.out.println("청소부가 청소를 열심히 한다.");
            }
        };
        p.action(w2);

        // 3 람다식 이용
        Workable w3 = () -> System.out.println("강사가 열심히 강의를 한다.");
        p.action(w3);
        p.action(() -> System.out.println("강사가 열심히 강의를 한다.")); // 이렇게 쓰는게 더 빠름
    }
}

// 1번 예시를 위한 임의의 클래스..
class Mechanic implements Workable {

    @Override
    public void work() {
        System.out.println("정비공이 정비를 합니다.");
    }
}