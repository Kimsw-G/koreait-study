package chap06.exam01;

public class MethodExam3 {
    public static void main(String[] args) {
        int mon = 10;

        printSeason(mon);
    }

    public static void printSeason(int month){
        switch(month){
            case 3: case 4: case 5:
                System.out.println("봄");
                return;
            case 6: case 7: case 8:
                System.out.println("여름");
                return;
            case 9: case 10: case 11:
                System.out.println("가을");
                return;
            case 12: case 1: case 2:
                System.out.println("겨울");
                return;
        }
        System.err.println("잘못된 입력");
    }
}
