package ch05.sec03;

public class StringMethod {
    public static void main(String[] args){
        // 문자열 부분 변경
        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바","Java");

        System.out.println("oldStr:" + oldStr);
        System.out.println("newStr:" + newStr);

        String oldStr2 = "가나다라1마바사2ABCDEFG";
        String newStr2 = oldStr2.replaceAll("\\d", "");

        System.out.println("oldStr2:" + oldStr2);
        System.out.println("newStr2:" + newStr2);

        String oldStr4 = "안녕 하 세요. 반가워요. 저는 홍 길동 입니다.";
        String newStr4 = oldStr4.replace(" ","");
        System.out.println("newStr4:" + newStr4);
        //만약 .도 빼고싶다면 ("[ ,.]","");

    }
}
