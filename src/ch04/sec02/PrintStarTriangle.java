package ch04.sec02;

public class PrintStarTriangle {
    public static void main(String[] args){
        int star = (int)(Math.random()*4.0)+3;
        System.out.println("star:" + star);

        for( int i = 0; i < star; i++) {

            for (int a=0; a <= i; a++){
                System.out.print("*");

            }
            System.out.println();
        }
        }
    }



