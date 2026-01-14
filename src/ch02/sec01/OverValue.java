package ch02.sec01;

public class OverValue {
    public  static  void main (String[]args){
        byte b1 = -128;
        System.out.println("b1:" + b1);
        // byte b2 = -129; 안됨. 그릇이 1l짜리인데 1.1 물을 넣으려고 함
        byte b3 = 127;
        System.out.println("b3:" + b3);
        // byte b4 = 128; 안됨. 그릇이 1l짜리인데 1.1 물을 넣으려고 함

        // int 4byte, long 8byte
        // 정수 리터럴은 기본적으로 int타입이다. l,L을 붙여서 long타입으로 변경한다.
        long l1 = 1_000_000_000_000L;
        System.out.println("l1:" + l1);
        // long l2 = 9_300_000_000_000_000_000L; 웬만한 수는 다 출력됨 ....
        long l3 = 2_147_483_647; //int가 저장할 수 있는 최대 값. 넘어가면 L붙여야함.
        // int값이 저장할 수 있는 값은 L을 안 붙여도되는데 헷갈리니까 걍 붙여라
        // L을 붙이는 이유: 타입이 그렇다 롱타입이라는것임.

        // double 8byte, float 4byte
        // 실수 리터럴은 기본적으로 double 타입임 .d,D를 붙여도 되고 안 붙여도 된다.
        // 프로그래밍에서 더블(Double) 타입은 실수를 표현하는 대표적인 데이터 타입.
        // 소수점이 붙은 숫자(예: 3.14, -0.5)를 저장할 때 사용
        double d1 = 10.1;

        // float f1 = 10.1; // 더 큰 쪽에서 작은 쪽으로 데이터를 옮길 때는 자동 형변환 안됨.
        float f2 = 10.1f; // 리터럴에 f.F를 붙이면 float타입의 리터럴이 된다.
        double d2 = f2; // 자동형변환이 된다. float > double타입으로 변경. 작은쪽 > 큰쪽은 자동형변환o

        long l2 = 1_000_000_000_000L;
        float f3 = l2; // 지수로 변환해서 저장하기 때문에 float과 double은 아주 큰 값도 저장가능
        // 근데 정확도는 좀 떨어짐 ㅇㅇ

        // byte < short, char < int < long < float < double
        // 좌측에서 우측으로는 자동형변환 된다.
        // 우측에서 좌측으로는 자동형변환x

        long l4 = 10L;
        int i1 = (int)l4; //강제형변환
        System.out.println("l4:" + l4);
        System.out.println("i1:" + i1);

        //byte -128 ~ 127 범위 값을 지정 할 수 있다.
        int i2 = 128;
        byte b4 = (byte)i2; //오버플로우: 원이라고 생각하면 쉬움 한바퀴 다 차면 -로 까버림
        System.out.println("b4:" + b4);

        int i3 = -129;
        byte b5 = (byte)i3;
        System.out.println("b5:" + b5);

    }
}
