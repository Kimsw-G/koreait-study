package chap04.exam01;

public class ForMission3 {
    public static void main(String[] args) {
        char star = '*';
        for(int j=0;j<50;j++){
            int starCnt = (int)(Math.random()*6)+5;
            
            
            for(int i=0;i<starCnt;i++){
                System.out.print(star);
            }
            System.out.println(starCnt);
        }
    }
}
