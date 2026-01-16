package ch06.sec03;

public class CarMain {
    public static void main(String[] args){
        Car c1 = new Car("그랜저", "검정",300);
        c1.introduceMySelf();

        Car c2 = new Car("K8");
        c2.introduceMySelf();

        Car c3 = new Car();
        c3.introduceMySelf();//모닝, 회색, 150

        Car c4 = new Car("k5",220);
        c4.introduceMySelf(); //"K5",회색,220
    }
}
