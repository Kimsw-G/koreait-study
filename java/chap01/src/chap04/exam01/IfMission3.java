package chap04.exam01;


public class IfMission3 {
    public static void main(String[] args) {
        
        for(int i = 0; i<10;i++){
            loopExam();

        }

    }

    public static void loopExam(){
        final int SCORE = (int)(Math.random()*30) + 71; // 81~100점 사이의 SCORE값 지정
        // final int SCORE = 100;
        System.out.print("점수 : "+SCORE + " : ");

        // 90~100 A (98점 이상이면 "A+", 97~94 "A", 94밑 "A-")

        if(SCORE > 90){
            System.out.print("A");
        }else if(SCORE>80){
            System.out.print("B");
        }else if(SCORE>70){
            System.out.print("C");
        }
        
        int imsi = (SCORE%10!=0?SCORE%10:10); // 모드값 0이면 10, 아니면 모드값 리턴

        if(imsi >= 8){
            System.out.print("+");
        }else if(imsi>=4){
        }else{
            System.out.print("-");
        }
        System.out.println();
    }
}
