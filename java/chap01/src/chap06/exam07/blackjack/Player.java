package chap06.exam07.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final int PRICE = 1000;
    private int amount; // 현금
    public String name;

    // List로 카드 받기
    List<Card> list = new ArrayList<Card>();

    // 생성자. 현금 같이 갱신
    public Player(int amount,String name){
        this.amount = amount;
        this.name = name;
    }

    // 뽑은 카드 저장하기!
    public void getCard(Card cardSub){
        list.add(cardSub);
    }

    // 숫자 총합 구하기!
    public int getTotal(){
        int total = 0;
        for (Card cardSub : list) {
            total += cardSub.getPatternToInt();
        }
        return total;
    }

    // 뽑은 카드의 숫자가 16 이하일때 검사하기
    // false일때는 또 뽑아야한다.
    public boolean chkSixteen(){
        return (getTotal()>16)? true:false; 
    }

    public void printCard(){
        System.out.println(this.name + "의 카드는?");
        for (Card cardSub : list) {
            cardSub.showCard();
        }
        System.out.println(getTotal());
    }

    public void win(){// 이겼을때!
        amount+=PRICE; // 현금 추가!
        System.out.println(this.name+"가 이겼다!");
        list.clear();
    }

    public boolean lose(){
        amount-=PRICE; // 현금 깎아버리기
        System.out.println(this.name+"가 졌다!");
        list.clear();
        if(amount<PRICE){ // 금액이 없다!
            System.out.println(this.name+"은 금액이" +this.amount+"밖에 없다! 눈 앞이 깜깜해졌다!");
            return false;
        }
        System.out.println(this.name+"은 금액이 아직"+this.amount+"남았다!");
        return true;
    }
}
