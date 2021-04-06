package chap06.exam05;

public class CapsuleExam1 {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();

        h1.setAge(12);
        h1.setName("홍길동");

        h2.setAge(20);
        h2.setName("신사임당");
        
        System.out.println(h1.toString());
        System.out.println(h2.toString());
    }
}
