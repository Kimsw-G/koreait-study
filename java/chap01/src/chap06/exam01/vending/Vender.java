package chap06.exam01.vending;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Vender {
    LinkedHashMap<String,Integer> menu = new LinkedHashMap<>();
    Set<String> set = menu.keySet(); // key값
    Scanner sc = new Scanner(System.in);
    int amount = 0;
    
    public Vender(){
        menu.put("콜라", 1000);
        menu.put("사이다", 1200);
        menu.put("환타", 1300);
        menu.put("스프라이트", 1500);
        menu.put("망고주스", 2000);
        menu.put("포도주스", 3000);
    }
    
    public boolean run(){
        printMenu();
        return buyMenu(sc.nextInt());
    }
    
    public void printMenu(){
        Iterator<String> it = set.iterator();
        System.out.println("<Menu>");
        for(int i=1;it.hasNext();i++){
            String key = it.next();
            System.out.printf("%d. %s (%,d원)\n",i,key,menu.get(key));
        }
        System.out.println();
        System.out.print("선택>");
    }

    public boolean buyMenu(int num){
        Iterator<String> it = set.iterator();
        for(int i=1;it.hasNext();i++){
            String key = it.next();
            if(i==num){
                System.out.println(key + "를 구매했습니다!");
                amount -= menu.get(key); // key값에 해당하는 금액 깎기.
                return true;
            }
        }
        System.out.printf("종료합니다!(남은 금액 : %d)",amount);
        return false;
    }

    public void putMenu(String drink, int price){
        menu.put(drink, price);
    }


}
