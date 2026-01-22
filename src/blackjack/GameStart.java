package blackjack;

import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        //딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 각자 2개의 카드를 소지한다.
        for(int i=0; i<2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }
        //딜러가 가지고 있는 카드의 점수가 16점 이하면 카드 한장을 더 소지하게 한다.
        if(dealer.needMoreCard()) {
            dealer.receiveCard(cd.draw());
        }
        dealer.showYourCards();

        Scanner scanner = new Scanner(System.in); //키보드 입력 받기 위한 scanner 객체 생성 (System.in)은 키보드 종료
        while (true) { // 사용자가 n입력할때까지 무한반복
            //게이머에게 카드를 더 받을지 물어봄
            gamer.showYourCards(); // 현재 게이머가 갖고있는 카드 보여줌
            System.out.print("카드를 더 받으시겠습니까? (y/n)"); // 사용자한테 질문
            String answer = scanner.next(); // 사용자가 입력한 문자열 읽어와서 answer 변수에 저장
            if ("n".equalsIgnoreCase(answer)) { //입력값이 n이면 반복문 빠져나감
                break;
            } else if ("y".equalsIgnoreCase(answer)) { //y면
                gamer.receiveCard(cd.draw()); // 카드덱에서 카드 뽑아서(draw) 게이머한테 줌(receiveCard)
            }
            // y나 n이 아닌 다른 값 입력하면 다시 위로 올라가 질문 반복
        }
        //비교, 누가 이겼습니까?
        dealer.showYourCards(); // 반복 끝났으니 딜러 카드 공개

        Rule.whoIsWinner(dealer, gamer); // 승패판정

    }
}