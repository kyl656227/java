package ch06.sec08;

public class PracticeMethod {
    public void abs(int num) {
        System.out.println(num < 0 ? -num : num);
    }

    public int random(int num) {
        return (int) (Math.random() * num);

    }

    public int random(int num1, int num2) {
        return (int) (Math.random() * (num2 - num1) + num1);
    }
    //260119 월
    public String getGrade(int score) {
        if (score > 90) {
            return "A";
        } else if (score > 80) {
            return "B";
        } else {
            return "C";
        }

    }

    public void printStar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public void printStarTriangle(int num){
        for(int i = 0; i < num; i++){
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    public void pintStarTriangle(int star) {
        for(int k=1; i<=star; k++) {
            printStar(k);
         }
     }
     */

    public void printStarRectangle(int star){
        for(int i = 0; i<star; i++){
            for (int k=0; k<star; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void gugudan(int num) {
        for(int i=1; i<=9; i++){
            int result = num * i;
            System.out.printf("%d x %d = %02d\n" , num, i, result);
        }
    }

    public void gugudan(int num1, int num2){
        for(int i=num1; i<=num2; i++) {
            gugudan(i);
        }
    }

    public int sum (int n1, int n2) {
        int result = 0;
        for (int i=n1; i <= n2; i++) {
           result = result + i;
        }
        return result;

    }





}



