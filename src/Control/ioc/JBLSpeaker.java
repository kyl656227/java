package Control.ioc;

import Control.Regacy.Speaker;
import Control.Regacy.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker(Woofer woofer){
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("JBL Speaker: 소리가 깔끔하다.");
        woofer.baseSound();
    }
}
