package ch02.sec01;
// p.64
public class OperationPromotionExample {
    public static void main (String[]args) {
        int n1 = 10;
        int n2 = 3;
        int result = n1 / n2;
        System.out.println("result:" + result);

       double n3 = 10;
       double n4 = 3;
       double result1 = n3 / n4;
       System.out.println("result:" + result1);
       // =
       double result2 = (double)n1 / n2;
        System.out.println("result:" + result2);

        char c1 = 'A';
        System.out.printf("%c - %d\n" , c1 , (int)c1);

        int i1 = c1 + 2;
        System.out.printf("%c - %d\n", (char)i1, i1); // 문자 형변환이 된 후 찍힘

        String str = "AC"; //[0] : 65, [1]:67
        System.out.println("str:" + str);
        // 소문자로 시작하는 애들 : 리터럴
        // 대문자 : 레퍼런스 타입(주소 값 저장)


    }
}
