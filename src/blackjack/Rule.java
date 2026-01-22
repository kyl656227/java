package blackjack;

public class Rule {
    // 2~10은 숫자 그대로 점수를, K/Q/J는 10점으로, A는 1로 계산
    // 카드들의 모든 점수를 더하고 더한 점수를 리턴.
    // 몇점인지 계산하는 역할은 룰 클래스에게 몰아줌
    public static int calcScore(Card[] cards) {
        int totalscore = 0;
        for (Card card : cards) {
            String denomination = card.getDenomination();
            //switch표현
            int score = switch (denomination) {
                case "A" -> 1;
                case "J", "Q", "K" -> 10;
                default -> Integer.parseInt(denomination);
            };
            totalscore += score;
        }
        return totalscore;
    }

    public static void whoIsWinner(Dealer dealer ,Gamer gamer){

        Card[] dealerCards = dealer.openCard();
        Card[] gamerCards = gamer.openCard();
        int dealerScore = calcScore(dealerCards);
        int gamerScore = calcScore(gamerCards);

        /*
        둘의 점수가 같으면 무승부 둘다 21점 초과면 무승부
        딜러가 21점 초과, 게이머 21점 이하 = 게이머 승
        게이머가 21점 초과, 딜러가 21점 이하 = 딜러 승
        둘 다 21점 초과 x, 게이머가 딜러보다 점수가 높음 = 게이머 승
         */

        int blackjack = 21;
        System.out.printf("딜러: %d 게이머: %d\n" , dealerScore, gamerScore);

        if(dealerScore == gamerScore || (dealerScore > blackjack && gamerScore > blackjack)){
            System.out.printf("무승부");
        } else if ( dealerScore > blackjack && gamerScore <= blackjack){
            System.out.printf("게이머 승");
        } else if ( gamerScore > blackjack && dealerScore <= blackjack){
            System.out.printf("딜러 승");
        } else if ( gamerScore <= blackjack && dealerScore <= blackjack && gamerScore > dealerScore){
            System.out.printf("게이머 승");
        } else {
            System.out.printf("딜러 승");
        }

       /* 강사님 코드
       if(dealerScore == gamerScore || dealerScore > BLACKJACK_SCORE && gamerScore > BLACKJACK_SCORE) {
            System.out.println("무승부");
        } else if(dealerScore > BLACKJACK_SCORE || gamerScore <= BLACKJACK_SCORE && gamerScore > dealerScore) {
            System.out.println("게이머 승");
        } else {
            System.out.println("딜러 승");
        }*/
    }
}