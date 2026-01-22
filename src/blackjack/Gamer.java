package blackjack;

public class Gamer {
    //게이머는 카드 객체 주소값 52개를 저장할 수 있다.
    protected final String name;
    protected Card[] cards = new Card[52];
    private int receiveIdx = 0;

    public Gamer() {
        this("게이머");
    }

    protected Gamer(String name) {
        this.name = name;
    }

    public void receiveCard(Card card){
        cards[receiveIdx++] = card; //받은 카드
    }


    /* 게이머는 처음에 최대 52장 담을 수 있는 큰 배열을 만듦
    실제로 게임을 하면 2~3장만 갖고있음 그때 52칸짜리 배열을 넘겨주면 ,
    뒤쪽 빈칸 null들 때문에 에러생김 그래서 받은 개수만큼의 딱 맞는 새 배열 만듦
     */
    public Card[] openCard() {

        //null이 없는 새로운 Card 배열을 만들어서 리턴
        Card[] newc = new Card[receiveIdx]; //현재까지 받은 개수만큼의 새 배열
        for (int i = 0; i < newc.length; i++) {
            newc[i] = cards[i];
        }
        return newc;
    }
    public void showYourCards() {
        System.out.printf("----- %s -----\n", this.name);
        for(Card c : openCard()) {
            System.out.println(c);
        }
    }
}
