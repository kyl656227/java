package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /*
     배열은 크기가 고정, 크기가 변경이 안됨
     크기 변경해서 사용하고 싶으면 새로운 배열 만들어서 복사 -
     값 넣고 써야했음.

     한 곳에 여러 값을 담을수 있는 애들을 Collection이라고 부름
     배열 , ArrayList(주로씀) , LinkedList, Set 등등
     */

    public static void main(String[] args) {
        // List<String> 나 유연한 배열인데 각 방은 String이야.
        List<String> list = new ArrayList<>(); // list는 array이의 부모. 상속관계
        list.add("하하");
        list.add("후후");
        list.add("크크");

        String str1 = list.get(0);
        list.remove(1); // 배열 길이 줄이는 방법.
        System.out.println(list.size()); //arraylist에서는 length대신 size라고 씀.
        System.out.println(list);

        // List, ArrayList >> 상속관계
        // List 는 부모타입
        // List 는 interface

        // Wrapper 클래스 : primitive 타입의 클래스형
        List<Integer> list2 = new ArrayList<>();
        //list2.add("하하") 스트링이라 안됨.
        list2.add(10);
        list2.add(11);
        list2.add(12);
        int int1 = list2.get(0);
        System.out.println(list2);


    }
}