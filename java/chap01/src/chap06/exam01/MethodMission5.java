package chap06.exam01;

public class MethodMission5 {
    public static void main(String[] args) {
        int star = 5;
        printStarTri(star);

        System.out.println("============");

        star=3;
        printStarTri(star);
    }

    public static void printStarLine(int cnt){
        System.out.print("*");
        if(1<cnt){
            printStarLine(cnt-1);
        }else{
            System.out.println();
        }
            
    }

    public static void printStarSquare(int cnt){
        
        for(int i=0;i<cnt;i++){
            printStarLine(cnt);
        }
    }

    public static void printStarTri(int cnt){
        // printStarLine(cnt);
        // if(1<cnt){
        //     printStarTri(cnt-1);
        // }

        for(int i=1; i<=cnt;i++){
            printStarLine(i);
        }
    }
}
