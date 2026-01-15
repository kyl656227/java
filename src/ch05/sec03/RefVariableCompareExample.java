package ch05.sec03;

public class RefVariableCompareExample {
    public static void main(String[] args){
        // 자바에서 배열 만드는 방법 중 하나
        // 자바에서도 배열은 객체임
        // *primitive 변수를 제외한 모든 것들은 참조 변수임.
        int a; // (primitive 타입)일반 변수

        // 아래는 모두 Reference 타입이라고 부름
        int b [];
        int[] arr1 = {1,2,3}; //각 방의 타입 여기서는 int값만 들어갈 수 있음
        int[] arr2 = {1,2,3};
        int[] arr3 = arr1; //주소값 복사 : Shallow Copy (얕은 복사)

        System.out.println("arr.length:" + arr1.length);
        // 자바의 배열의 속성은
        // ! 레퍼런스 타입끼리의 == 비교는 주소값 비교이다. !
        // 레퍼런스 타입끼리의 == 비교는 동일성 비교이다.
        // 같은 주소인가? 를 물어보는 것임. 같은 인물이냐를 물어보는것 (같을 수 없음)
        System.out.println( "arr1 == arr2 :" + (arr1 == arr2));
        System.out.println( "arr1 == arr3 :" + (arr3 == arr1));

    }
}
