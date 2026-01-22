package ch07.sec10;

public class PhoneMain {
    public static void main (String[] asgs){
        // Phone p = new Phone(); -> 객체화 안됨
        Phone p = new SmartPhone();
        p.bell();
    }
}
