package chap06.exam07.blackjack;

public class Main implements CardDeck{
    public static void main(String[] args) {
        Deck deck = new Deck(10000,10000);

        // deck.run();
        while(deck.run());
    }
}

