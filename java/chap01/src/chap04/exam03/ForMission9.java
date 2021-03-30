package chap04.exam03;

public class ForMission9 {
    public static void main(String[] args) {
        final int STAR = 7;
    
        for(int i=1;i<=STAR;i++){ //i : 줄 번호
            for(int j=0;j<STAR-i;j++){// STAR - i번째줄만큼 반복
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){//줄 번호만큼 반복
                System.out.print("*");
            }
            System.out.println();//줄바꿈
        }

        for(int i=0; i<STAR*STAR;i++){
            if(i%STAR==0&&i!=0){
                System.out.println(); // STAR의 배수마다 개행, 첫 줄 제외
            }
            int star = i/STAR; // 찍어줄 별의 갯수 (0~4)
            if(i%STAR<STAR-star-1){ // STAR - star - 1 : 블랭크를 찍어줄 갯수
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }
        
    }
}
