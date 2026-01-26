package ch15.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // 제네릭 첫번재 : key 타입
        // 두번째: value타입
        Map<String, Integer> map = new HashMap<>(); // Map이 부모 HashMap 에 상속

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        System.out.println("Value0-0: " + map.get("홍길동"));
        map.put("홍길동", 95); //홍길동 덮어쓰기됨. 추가x
        System.out.println("value0-1: " + map.get("홍길동"));

        int value1 = map.get("신용권");
        System.out.println("value1: " + value1);
        System.out.println("value2: " + map.get("동장군"));
        System.out.println("value2: " + map.get("ㅋㅋㅋ"));

        System.out.println("size: " + map.size());

        // Set은 Value만 저장하고 중복값 저장이 x
        Set<String> keySet = map.keySet(); //key값들만 빼내서 set으로 만든 것(신용권, 홍길동, 동장군)
        //Set 객체를 이용하여 Iterator 반복자를 생성(반복하기 위해서)
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){ // hasNext 다음을 가지고 있느냐? 데이터 있으면 true:    false:
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.printf("%s - %d\n ", k,v);
        }
    }
}
