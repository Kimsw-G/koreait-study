package chap07.exam01;

public class ExceptionExam1 {
    
    public static void main(String[] args) {

        try {
            System.out.println("나는 10에 0을 나눌꺼야");
            int rs = 10/0;
            System.out.println("rs : "+rs);
            // main.html을 보여준다 
        } catch (Exception e) {
            System.out.println("에러발생~~");
            // error.html을 보여준다
        } 
        int rs = 10/0;


    }
}
