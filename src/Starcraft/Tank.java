package Starcraft;
// 시즈탱크 (공성 전차)
public class Tank extends Unit {
    private boolean isSiegMode;


    public void changeMode(){
        isSiegMode = !isSiegMode; //false라면 true로 바꿈

        // 바꾼 값을 다시 원래대로 돌림.
       System.out.printf("시즈모드 %s\n", (isSiegMode = !isSiegMode) ? "ON" : "OFF");
    }

    @Override
    public String toString(){
        return "시즈탱크" + super.toString(); //
    }




}




