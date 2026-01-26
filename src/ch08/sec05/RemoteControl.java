package ch08.sec05;

public interface RemoteControl { // interface는 static이 안붙은 멤버필드를 가질 수 없다!
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    public abstract void setVolume(int volume); // 추상메소드라 자동으로 public abstract

    // 인터페이스도 추상클래스처럼 구현부가 있는 메소드 만들 수 있으면 좋겟당!
    // 디폴트 메소드
    public default void setMute(boolean mute){ // 앞에 디폴트만 적어주면됨. public은 자동
        if(mute){
            System.out.println("무음처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음해제합니다.");
        }
        defaultstaticCommon(); //호출 가능 static은 어디서든 호출할 수 있음
    }

    // 스태틱 메소드(클래스 메소드)는 가질 수 있다.
    static void changeBattery() {
        System.out.println("배터리를 교환합니다.");
    }

    // private 일반메소드, private static 메소드 만들 수 있고 구현부도 만들 수 있다.
    // => 목적은 default 나 static 메소드가 여러개일 때 중복처리를 메소드로 처리하기 위해 존재
    private void defaultCommon(){
        defaultstaticCommon();
    }

    private static void defaultstaticCommon(){}
   // setMute(true); 스태틱이 스태틱안붙은 애 이용 불가능
}