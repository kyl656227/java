package ch08.sec08;

public class MultiInterfaceMain {
    public static void main(String[] args){
        RemoteControl rc = new SmartTelevision();
        rc.turnOff();
        rc.turnOn();
        //rc.search("") 리모트 컨트롤 타입이라 사용 x


        SmartTelevision st = (SmartTelevision) rc;
        // 서치까지 사용하고싶다면 저걸 알고있는 스마트텔레비전으로 형변환 후 사용가능
        st.turnOn();
        st.turnOff();
        st.search("www.naver.com");

        //인터페이스는 객체화 안됨
        //아래는 클래스 이름이 없는 구현 클래스를 만들고 바로 객체화 함.
        //일회용임.
        RemoteControl rc2 = new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };
    }
}
