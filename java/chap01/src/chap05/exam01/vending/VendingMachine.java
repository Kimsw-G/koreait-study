package chap05.exam01.vending;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class VendingMachine {
    int balance;
    int expense; //지출금액
    String[] drink = {"콜라","사이다","환타"};
    int[] price = {1000,1200,1300};


    public VendingMachine(int balance){
        this.balance = balance;
        expense = 0;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            printMenu(); // 메뉴출력
            int key = sc.nextInt(); // 음료 선택받기
            if(key == 0) break;
            selectDrink(key);
        }
        System.out.println("지출 금액 : "+expense);
        System.out.println("프로그램 종료");
    }

    public void printMenu(){
        
        System.out.println("===============<메뉴>===============");
        for(int i=0;i<drink.length;i++){
            System.out.print(i+1 + ". "+drink[i]);
            System.out.printf("(%,d원)\n",price[i]);
        }
        System.out.println("현재 금액 : "+balance);
        System.out.print("선택 > ");
    }

    public void selectDrink(int key){
        key--;
        try{
            System.out.println(drink[key]+"를 선택하였습니다.");
            if(balance<price[key]){
                throw new MoneyException(price[key]-balance);
            }   
            balance-=price[key];//금액 반환
            expense+=price[key];
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("올바른 값을 입력하세요!");
        }catch(MoneyException e){
            
        }
    }
}
