package ch06.sec09;

public class ArrayListString {
    String[] arr;

    public ArrayListString() {
        arr = new String[0];
    }

    public void add(String val) {
        // 전역변수 arr이 가리키고 있는 배열보다 한 칸 더 큰 배열을 만든다.
        // 그리고 마지막 방에 val를 넣는다.
        String[] newarr = new String[arr.length + 1];
        int lastIdx = newarr.length - 1;
        newarr[lastIdx] = val;
        for (int i = 0; i < lastIdx; i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }

    public String get(int idx) {
        return arr[idx];
    }

    public String remove() {
        String[] newstring = new String[arr.length - 1];
        String delstring = arr[newstring.length];
        for (int i = 0; i < newstring.length; i++) {
            newstring[i] = arr[i];
        }
        arr = newstring;
        return delstring;
    }

    public void add(int idx, String val) {
        String[] temp = new String[arr.length + 1];
        temp[idx] = val;
        for (int i = 0; i < arr.length; i++) {
            temp[i < idx ? i : i + 1] = arr[i];
        }
        arr = temp;
    }

    public String remove(int idx) {
        String[] temp = new String[arr.length - 1];
        String delString = arr[idx];
        for (int i = 0; i < temp.length; i++) {
            temp[i < idx ? i : i + 1] = arr[i];
        }
        arr = temp;
        return delString;
    }

    public void remove(String val) {
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                remove(i);
                return;
            }
        }

    }
}
