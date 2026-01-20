package ch06.sec09;

public class Truck {
    /* static은 객체생성과는 상관x 공간이 무조건 하나임.
    static이 붙은애를 사용할 때는 (클래스명.) 으로 사용한다.
    객체 생성을 하지 않아도 이미 공간 할당이 됨.
    = 객체 생성을 하지 않아도 사용할 수 있다.
     */
    static String company; //공간은 하나라 객체생성 많이 해도 같은 값을 가짐.
    String model;

    void introudce(){
        System.out.printf("company: %s, model: %s\n", company, model);
    }

    static void run() {
        Truck t = new Truck();
        t.model = "15톤"; //static 안붙은애들쓰려면 무조건 객체화 해야함
        System.out.printf("%s 회사의 %s모델의 차량이 달린다.\n",company,t.model); //static이 있기 때문에 객체생성과 무관
    }
}
