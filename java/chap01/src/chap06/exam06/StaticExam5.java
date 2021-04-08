package chap06.exam06;

public class StaticExam5 {
    public static void main(String[] args) {
        // int a = sum(); // non static이라 에러 발생

        System.out.println(new StaticExam5().sum());
        
    }


    int n1;
    int n2;
    public int sum(){
        return n1 + n2;
    }
}
