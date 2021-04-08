package chap06.exam07.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck implements CardDeck{
    // 패턴, 심볼 
    private String pattern;
    private String symbol;
    private List<Card> deck = new ArrayList<Card>();
    // 선수 선언
    private Player p1;
    private Player p2;

    // 생성자로 pattern symbol 값 넣기 (시험내용)
    /*
    public Card(String pattern, String symbol){
        this.pattern = pattern;
        this.symbol = symbol;
    }
    */
    
    // 생성자와 함께 선수입장
    public Deck(int p1Amount, int p2Amount){
        p1 = new Player(p1Amount);
        p2 = new Player(p2Amount);
        p1.name = "임요한";
        p2.name = "홍진호";
    }

    // getter setter
    public String getPattern() {
        return this.pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    public String getSymbol() {
        return this.symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // 메인 실행하기
    public boolean run(){
        // 덱 섞기
        shuffleDeck();
        
        // printDeck();
        // 카드 뽑아서 딜러,클라이언트,딜러,클라이언트 주기
        for(int i=0;i<2;i++){
            p1.getCard(pcikCard());
            p2.getCard(pcikCard());
            new Player(0).getCard(pcikCard()); // 허공에 한 장
        }
        // 16 이하인지 검사하여 또 뽑기
        pickMore(p1);
        pickMore(p2);
        // 가지고 있는 카드 보여주기
        p1.printCard();
        p2.printCard();
        // 승자 출력하기
        try{
            Player winner = getWinner(p1, p2);
            Player loser = getLoser(winner);
    
            winner.win();
            return loser.lose();
        }catch(NullPointerException e){
            System.out.println("비겼습니다!");
            return true;
        }
    }

    // 덱 넣고 섞어버리기
    public void shuffleDeck(){
        for(String p : PATTERN){
            for(String s :SYMBOL){
                deck.add(new Card(s, p));
            }
        }
        Collections.shuffle(deck);

        
        System.out.println("덱을 섞었습니다!");
    }

    // 시스템 체크용. 덱 출력하기
    public void printDeck(){
        for (int i=0; i<deck.size();i++) {
            deck.get(i).showCard();
        }
    }

	// 카드 한 장 뽑기
	public Card pcikCard(){
        Card cardSub = deck.get(0);
        deck.remove(0);
        return cardSub;
    }

    // 숫자가 16이하일때 또 뽑기!
    public void pickMore(Player p){
        if(!p.chkSixteen()){
            p.getCard(pcikCard());
            System.out.println(p.name + "이 또 뽑았다!");
        }
    }

    // 숫자 비교하여 승부 겨루기
    public Player getWinner(Player p1,Player p2){ // 두 선수를 받아서 값 비교하기!
        int score1 = p1.getTotal();
        int score2 = p2.getTotal();
        if(score1<=21&&score2<=21){ // 둘 다 21 이하일때!
            if(score1>score2){
                return p1;
            }else if(score1<score2){
                return p2;
            }else{
                return null;
            }
        }else if(score1>21 && score2>21){ // 둘 다 21을 초과할때!!
            if(score1>score2){
                return p2;
            }else if(score1<score2){
                return p1;
            }else{
                return null;
            }
        }else{ // 한 쪽만 21을 초과할때!!
            if(score1>score2){
                return p2;
            }else{
                return p1;
            }
        }
    }
    public Player getLoser(Player winner){ // 패자 리턴받기!
        if(p1.equals(winner)){ // p1이 승자이면 p2를 반환
            return p2;
        }else{ // p2이 승자이면 p1을 반환
            return p1;
        }

    }

}
