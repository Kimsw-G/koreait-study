package chap03.prac01;

public class SwitchMission3 {
    public static void main(String[] args) {
        int season = (int)(Math.random()*12)+1;
        System.out.println("지금은 : "+season+"월");
        
        switch(season/=3){
            case 1:
                System.out.println("봄");
                break;
            case 2:
                System.out.println("여름");
                break;
            case 3:
                System.out.println("가을");
                break;
            default:
                System.out.println("겨울");
        }
    }
}
