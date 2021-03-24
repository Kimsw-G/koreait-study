package chap03.exam01;

public class CompareOperatorExam {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        boolean result1 = num1 == num2; //true
        boolean result2 = num1 != num2; //false
        boolean result3 = num1 <= num2; //true
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        char ch1 = 'a';
        char ch2 = 'b';
        boolean result4 = ch1<ch2;
        System.out.println(result4);

        float f = 0.1f;
        double d = 0.1;

        System.out.println(f==d);
        System.out.println(Double.compare(f, d));

        String str1_1 = "안";
        String str1_2 = "녕";
        String str2 = "안녕";

        System.out.println((str1_1+str1_2)==str2);

    }
}
