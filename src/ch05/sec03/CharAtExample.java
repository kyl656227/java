package ch05.sec03;

public class CharAtExample {
    public static void main(String[] args){
        String ssn = "950624-2230123";
        int len = ssn.length();
        System.out.println("len:" + len);


        System.out.printf("%d - %c", (int)'1','1');
        char gender = ssn.charAt(7);

       String gender1 = (gender == '2'||gender == '4') ? "여자" : "남자";
       // 정수로 적으면 안됨.

        System.out.println("gender1:" + gender1);



    }
}
