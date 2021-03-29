package chap04.exam01;

public class SwitchExam1 {
    public static void main(String[] args) {
        int val = 2;
        switch(val){
            case 1:
                System.out.println("값이 1");
                break;
            case 2:
                System.out.println("값이 2");
                break;
            case 3:
                System.out.println("값이 3");
                break;
            default : 
                System.out.println("1~3이 아님");
                break;
        }
        System.out.println("END");
    }
}
