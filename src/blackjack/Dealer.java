package blackjack;

public class Dealer extends Gamer{
    private final int DRAW_LIMIT = 16;

    public Dealer(){
        super("딜러");
    }
    public boolean needMoreCard(){
        // 내가 가진 카드들의 접수의 총 합이 16점 이하면 리턴 true
        // 아니면 return false가 되어야 함.
        Card[] receivedCards = openCard();
        int score = Rule.calcScore(receivedCards);
        return score <= DRAW_LIMIT;
    }
}
