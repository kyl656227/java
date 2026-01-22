package Starcraft;
// 수송선
public class Dropship extends Unit{
    // 8개의 유닛을 태울 수 있는 공간이 필요
    private Unit[] units = new Unit[8];
    private int loadIdx = 0;

    public void load(Unit unit) {
        if(loadIdx == units.length) { return; }
        units[loadIdx++] = unit;
    }

    public Unit unload(int idx){
        Unit temp = units[idx]; // idx에 있는 유닛을 잠시 보관 (나중에 리턴)
        for(int i=idx + 1; i<units.length; i++){ // 삭제된 칸 바로 뒷칸 idx+1부터 배열의 끝까지 반복문
            if(units[i] == null){ break;} //만약 검사하는 칸이 비었으면(null), 당길유닛x -> 중단
            units[i - 1] = units[i]; // 뒷칸(i)에 있는 유닛을 한 칸 앞(i-1)로 복사
        }
        // 유닛이 하나 줄었으니까 현재 유닛(loadIdx) 1줄이고, 기존 유닛 있던 칸 비움
        units[--loadIdx] = null;
        return temp; // 처음 보관한 유닛 객체 결과값으로 돌려줌
    }


    public void check(){
        for(int i=0; i<units.length; i++){
            System.out.printf("[%d]: %s\n", i, units[i]);
        }
    }
}
