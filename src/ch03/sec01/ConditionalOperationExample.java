package ch03.sec01;

public class ConditionalOperationExample {
    public static void main(String[] args ){
        int score = (int) (Math.random()*91.0)+10;
        System.out.printf("score:" + score);


        //삼항식을 이용해서 90점 초과는 A 출력, 80점 초과는 B C출력
        // 나머지는 C출력

        String result = (score > 90 ? "A" : score > 80 ? "B" : "C");
        System.out.printf("result:" + result);
     }
}
