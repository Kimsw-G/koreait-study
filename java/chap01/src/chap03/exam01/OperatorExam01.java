package chap03.exam01;

public class OperatorExam01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1/n2);
        //
        
        System.out.println((double)n1/(double)n2);
        System.out.println((double)n1/n2); // 앞에 double형 실수가 있어서 뒤에 int가 자동으로 형변환을 한다 
        //
        System.out.println(n1*n2);

        drawLine(); // 

        int result = 3+4+5*6;
        System.out.println("result : " + result);

        System.out.println(10%3);

        drawLine(); // 단항연산자 (부호)
        System.out.println(-3);

        



    }

    public static void drawLine(){
        System.out.println("--------------------------------------------------------");
    }
}
