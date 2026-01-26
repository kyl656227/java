package ch15.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMission {
    public static void main(String[] args) {
        // 생성자를 사용하는 이유? 객체 생성과 동시에 멤버필드를 초기화 하기 위해.

        ValueBox vb1 = new ValueBox(1,"권수영"); // 생성자 명시
        ValueBox vb2 = new ValueBox(2,"권준하");
        ValueBox vb3 = new ValueBox(3,"김가은");
        ValueBox vb11 = new ValueBox(11,"임준이");

        //ValueBox객체 주소값을 4개 담을 수 있는 배열 생성
        ValueBox[] newBox = new ValueBox[4];
        newBox[0] = vb1;
        newBox[1] = vb2;
        newBox[2] = vb3;
        newBox[3] = vb11;
        // 배열 > HashMap key값은 id value 객체 주소값
        Map<Integer, ValueBox> map = new HashMap<>();
        for(int i = 0; i< newBox.length; i++){
            map.put(newBox[i].id, newBox[i]);
        }
        ValueBox id3 = map.get(3);
        System.out.println(id3.name);

        System.out.println(map.get(11).name);
    }
}

class ValueBox {
    int id;
    String name;

    public ValueBox(int id ,String name){
        this.id = id;
        this.name = name;
    }
}