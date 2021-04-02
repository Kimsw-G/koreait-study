package chap06.exam01;

public class MethodExam {
    public static void main(String[] args) {
        
        int aaa = 10;
        int result = sum(aaa,10);

        System.out.println(result);
    }


    public static int sum(int n1, int n2){
        return n1+n2;
    }
}
