package chap04.exam04;

public class Exercise04 {
    public static void main(String[] args) {
        int dice1=0,dice2=0;

        System.out.println("dowhile");
        do{
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            System.out.println(dice1 + ","+dice2);
        }while(dice1+dice2!=5);
        System.out.println("while");
        dice1=0;
        dice2=0;
        while(dice1+dice2!=5){
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            System.out.println(dice1 + ","+dice2);
        }
        System.out.println("for");
        dice1=0;
        dice2=0;
        for(;dice1+dice2!=5;){
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            System.out.println(dice1 + ","+dice2);
        }

        


    }
}
