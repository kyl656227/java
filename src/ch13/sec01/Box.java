package ch13.sec01;
//<T> 제네릭, T문자열은 아무거나 해도됨. 타입이라는 의미의 T많이씀
// T 자리에 타입이 들어감. 아직 타입이 결정되지 않았다는 뜻
public class Box<T> {
    private T content;

    public void setContent(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
