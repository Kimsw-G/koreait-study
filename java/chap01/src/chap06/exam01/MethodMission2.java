package chap06.exam01;

public class MethodMission2 {
    public static void main(String[] args) {
        double rs = divide(10,3);
        System.out.println("result : "+rs);    

        rs = divide(10,5);
        System.out.println("result : "+rs);

        System.out.println("절대값 : "+abs(-10));
        System.out.println("절대값 : "+abs(10));
        System.out.println("절대값 : "+abs(-17.6));
    }

    public static double divide(double a, double b){
        // System.out.println("double double로 들어옴");
        return a/b;
    }
    public static double divide(int a, int b){
        // System.err.println("int int로 들어옴");
        return (double)a/b;
    }

    public static int abs(int num){
        if(num<0) return -num;
        return num;
    }

    public static double abs(double num){
        if(num<0) return -num;
        return num;
    }
}
