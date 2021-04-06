package chap06.exam02.vending;

public class Vender {
    
    Drink[] drink = new Drink[6];

    public Vender(){
        for(int i=0; i<drink.length;i++){
            drink[i] = new Drink();
            // drink[i].put(name, price);
        }
    }


}
