package chap05.exam01.vending;

public class MoneyException extends Exception{
    public MoneyException(int lack){
        System.err.println(lack + "원 모자랍니다.");
    }
}
