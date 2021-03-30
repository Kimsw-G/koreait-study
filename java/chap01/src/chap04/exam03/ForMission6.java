package chap04.exam03;

public class ForMission6 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*5 + 3); //3~7

        System.out.println("star : "+star);

        // for(int i=0; i<star; i++){ // i번째줄 출력
        //     for(int j=0;j<i+1;j++){ // i번째 줄에는 별이 i+1개 찍힘
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=0; i<star; i++){
        //     for(int j=i;j!=0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=star; i<star*2; i++){
            // System.out.print(i);
            for(int j=i;j!=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
