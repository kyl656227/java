package ch08.sec02;

public interface RemoteControl {
    // 멤버필드를 작성
    // 필드 선언 앞에 public static final 이 자동으로 들어감 (int)앞에 들어간거랑 똒같음
    int MIN_VOLUME = 0;
    int MAX_VOLUME = 10;
    /// 메소드 선언 앞에 public abstract 자동으로 들어감 수정 불가능.
    // 인터페이스에서는 리턴 타입 메소드명 파라미터만 적어주면 됨.
    void turnOn();
    void volumeUp();
    void volumeDown();
    void mute(); //음소거



}
