package chap06.exam02.vending;

public class Vender {
    
    
    String[] name = {"콜라","사이다","환타"};
    int[] price = {1000,1200,1300};
    Drink[] drink = new Drink[name.length];

    public Vender(){
        for(int i=0; i<drink.length;i++){
            drink[i] = new Drink(name[i],price[i]);
        }
    }


}
