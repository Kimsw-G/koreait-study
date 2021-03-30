package chap04.exam03;

public class ForExam2 {
    public static void main(String[] args) {
        int dan = 2;

        for(int i=dan; i<=9;i++){
            System.out.println(i+"단");
            for(int j=1;j<=9;j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
