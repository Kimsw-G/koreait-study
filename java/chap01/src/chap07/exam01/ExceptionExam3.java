package chap07.exam01;

public class ExceptionExam3 {
    public static void main(String[] args) {
        
        try {
            System.out.println(C2.div(5, 1));
            
        } catch (Exception e) {
            System.out.println("에러~");
        }
    }
}

class C2 {
    static int div(int n1, int n2) throws Exception{
        return n1/n2;
    }
}
