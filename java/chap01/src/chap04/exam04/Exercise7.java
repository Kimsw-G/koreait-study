package chap04.exam04;

import java.util.Scanner;

public class Exercise7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;


        while(run){
            System.out.println("========================");
            System.out.println("1.예금|2.출금|3.잔고|4.종료");
            System.out.println("========================");
            System.out.print("입력 : ");

            int key = sc.nextInt();
            switch(key){
                case 1:
                    balance = deposit(balance);
                    break;
                case 2:
                    balance = withdraw(balance);
                    break;
                case 3:
                    System.out.println("잔고 : "+balance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    sc.close();
                    run = false;
                    break;
                default:
                    System.out.println("올바른 값을 입력해주세요!");
                    break;
            }
        }
    }

    public static int deposit(int balance){
        System.out.print("입금액 : ");
        return balance+=sc.nextInt();
    }

    public static int withdraw(int balance){
        System.out.print("출금액 : ");
        int money = sc.nextInt();
        if(balance < money){
            System.out.println("잔액 부족!");
        }else{
            balance-=money;
        }
        return balance;
    }


}
