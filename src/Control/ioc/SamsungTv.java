package Control.ioc;

import Control.Regacy.Speaker;
import Control.Regacy.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;


    public SamsungTv(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv의 소리는요");
        speaker.speakerSound();
    }
}
