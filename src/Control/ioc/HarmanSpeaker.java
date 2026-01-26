package Control.ioc;

import Control.Regacy.Speaker;
import Control.Regacy.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer; //Woofer를 implements한 객체 주소값을 가질 수 있다.

    // 기본 생성자 명시 - 파라미터없음!!
    public HarmanSpeaker(Woofer woofer){
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Harman Speaker: 소리가 맑아요.");
        woofer.baseSound();
    }
}
