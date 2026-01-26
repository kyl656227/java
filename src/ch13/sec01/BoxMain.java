package ch13.sec01;

public class BoxMain {
    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<>(); // 객체화 될 때 타입 결정
        boxInt.setContent(1); // 여기에는 int타입 서야함.
        int r1 = boxInt.getContent();

        Box<String> boxString = new Box<>(); // T 자리가 전부 String이 됨.
        boxString.setContent("하하 스트링");
        String r2 = boxString.getContent();
    }
}
