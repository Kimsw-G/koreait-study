package chap04.exam03;

public class ForMission4 {
    public static void main(String[] args) {
        int dan = (int)(Math.random()*8)+2;
        // int dan = 2;
        // for(int i = dan;i<=9;i++){
        //     printHorizon();
        //     System.out.println(i+"단");
        //     for(int j=1; j<=9;j++){
        //         System.out.println(i + " * " + j + " = " + i*j);
        //     }
        // }
        System.out.println(dan+"단");
        for(int i=6; i<15; i++){
            int imsi = i-5;
            System.out.println((dan) + " * " +(imsi) + " = " +(imsi*dan));
        }
    }

    public static void printHorizon(){
        System.out.println("=============================================");
    }
}
