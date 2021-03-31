package chap04.exam04;

public class Exercise5 {
    public static void main(String[] args) {
        /*
            중첩 for문 4x + 5y = 60인 해를 출력
        */
        final int X_MUL = 4;
        final int Y_MUL = 5;


        for(int x=1;x<=10;x++){
            for(int y=1;y<=10;y++){
                if(X_MUL*x + Y_MUL*y == 60){
                    System.out.println(x + "," + y);
                }
            }
        }
    }
}
