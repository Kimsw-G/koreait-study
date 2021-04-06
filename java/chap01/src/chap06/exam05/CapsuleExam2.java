package chap06.exam05;

public class CapsuleExam2 {
    public static void main(String[] args) {
        Human[] h = new Human[4];
        
        h[0] = new Human();
        h[1] = new Human("평강공주");
        h[2] = new Human(30);
        h[3] = new Human("이순신",20);

        for (Human huamn : h) {
            System.out.println(huamn.toString());
        }
    }    
}

