package chap04.exam04;

public class WhileExam2 {
    public static void main(String[] args) {
        int i=0;
        while(true){
            if(i==4){
                break;
            }
            System.out.println("i : "+i++);
        }
        System.out.println("끝");
    }
}
