package Starcraft;
// 시즈탱크 (공성 전차)
public class Tank extends Unit {
    private boolean isSiegMode;


    public void changeMode(){
        isSiegMode = !isSiegMode;
       System.out.printf("시즈모드 %s\n", (isSiegMode = !isSiegMode) ? "ON" : "OFF");
    }

    @Override
    public String toString(){
        return "시즈탱크" + super.toString(); //
    }




}




