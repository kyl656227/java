package ch11.sec02;

public class ExeptionFainallyExample2 {
    public static void main(String[] args) {
        System.out.println(div(10, 3));
        System.out.println(div(10, 0));
    }

    public static int div(int n1, int n2){
        try {


            System.out.println("하하");
            return n1 / n2;
        } catch (Exception e){
            return 0;
        } finally { //무슨일이 있어도 실행
            System.out.println("Finally");
        }

    }
}
