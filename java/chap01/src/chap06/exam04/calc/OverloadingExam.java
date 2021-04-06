package chap06.exam04.calc;

public class OverloadingExam {
    public static void main(String[] args) {
        Calc.sum(5, 10);

        Calc.sum(10, 15, 25);
    }
}

class Calc{
    // static void sum(int n1, int n2){
    //     System.out.println(n1+n2);
    // }

    // static void sum(int n1, int n2, int n3){
    //     System.out.println(n1+n2+n3);
    // }

    static void sum(int... var){
        int sum=0;
        for (int i : var) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
