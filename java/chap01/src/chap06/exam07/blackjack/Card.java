package chap06.exam07.blackjack;


public class Card {
    private String pattern; // A,1,2...J,Q,K
    private String symbol; // SPADE,DIAMOND,HART,CLOVER

    public Card(String pattern,String symbol){
        this.symbol = symbol;
        this.pattern = pattern;
    }

    public void showCard(){
        System.out.printf("%s - %s\n",pattern,symbol);
    }

    public String getPatternToString(){
        return this.pattern;
    }

    public int getPatternToInt(){
        String p = this.pattern;

        if(p.equals("A")){
            return 1;
        }else if(p.equals("J")){
            return 11;
        }else if(p.equals("Q")){
            return 12;
        }else if(p.equals("K")){
            return 13;
        }else{
            return Integer.parseInt(p);
        }
    }
}
