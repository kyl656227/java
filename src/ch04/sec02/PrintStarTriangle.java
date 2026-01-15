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


    //  역삼각형
//  for (int i = star; i >= 1; i--) {
//
//            // i의 값만큼 별을 출력합니다.
//            for (int a = 0; a < i; a++) {
//                System.out.print("*");
//            }
//
//            System.out.println(); // 줄바꿈
//        }
//    }
//}

