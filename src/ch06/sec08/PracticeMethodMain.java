package ch06.sec08;

public class PracticeMethodMain {
    public static void main(String[] args){
        PracticeMethod pm = new PracticeMethod();
        pm.abs(10);
        pm.abs(-10);
        pm.abs(-5);

        int r1 = pm.random(10);
        int r2 = pm.random(20);

        System.out.println("random:" + r1);
        System.out.println("random:" + r2);

        int r3 = pm.random(2,10);
        int r4 = pm.random(10,15);

        System.out.println("random:" + r3);
        System.out.println("random:" + r4 );

        //260119 월
        String grade = pm.getGrade(100);
        System.out.println("score:" + grade);

        pm.printStar(5);
        pm.printStar(2);
        System.out.println("-----");
        pm.printStarTriangle(5);
        System.out.println("-----");
        pm.printStarRectangle(3);
        System.out.println("-----");
        pm.gugudan(5);
        System.out.println("-----");
        pm.gugudan(3,6);
        System.out.println("-----");
        int sum = pm.sum(10,50);
        System.out.println("sum:" + sum);

    }
}
