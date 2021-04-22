package chap07.exam01;

public class ExceptionExam2 {
    public static void main(String[] args) {
        // Calc c = new Calc();
        // System.out.println(c.div(10, 2));

        System.out.println(Calc.div(10, 2));
    }
}

class Calc{
    static float div(int n1, int n2){
        float rs=0;
        try {
            rs = (float)n1/n2;
            return rs;
        } catch (Exception e) {
            System.out.println("에러~~");
        }finally{
            System.out.println("진짜!! 무조건~~실행");
        }
        System.out.println("무조건 실행.");
        return 0;
    }
}