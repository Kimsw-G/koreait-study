package chap04.exam03;

public class ForExtra1 {
    public static void main(String[] args) {

        final int LEN = 5;        

        
        for(int i=LEN;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=0;i<LEN;i++){
            for(int j=i;j<LEN;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=0;i<LEN;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j);
            }System.out.println();
        }

        for(int i=0;i<LEN;i++){
            for(int j=LEN-i-1;j<LEN;j++){
                System.out.print(j);
            }System.out.println();
        }
    }
}
