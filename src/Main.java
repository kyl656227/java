//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
class {} 안에 코드 작성을 한다.
컨파일 언어에서는 main 메소드가 굉장히 특별한 메소드이다 -> 프로그램의 시작점이라서.
main 메소드가 호출이 되면서 프로그램이 시작하게 됨.
자바에서는 main 메소드 모양이 항상 같아야 한다. 유일하게 달라도 되는 부분은 "args"매개변수명만 바꿀 수 있다.
나머지는 그대로 작성해야함.
 */


public class Main {
    public static void main(String[] args) {
        // js의 console.log()와 비슷하다. 다른것은 개행을 해주지 않음.
        // 개행을 하고 싶다면 println 메소드 호출로 해결
        System.out.println("Hello and welcome!");
        // js는 타입을 엄격하게 구분한다. 꼰중의 꼰;
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}