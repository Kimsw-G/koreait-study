package chap03.exam01;


public class Exercise08 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;

        double z = x/y;

        System.out.println(Double.isNaN(z));

        if(Double.isNaN(z)){
            System.out.println("0.0으로 나눌 수 없음");
        }else{
            double result = z +10;
            System.out.println("result : "+result);
        }
    }
}
