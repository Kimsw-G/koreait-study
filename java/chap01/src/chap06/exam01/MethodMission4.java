package chap06.exam01;

import java.util.Arrays;

public class MethodMission4 {
    public static void main(String[] args) {
        int[] cnt = new int[10];
        for(int i=0;i<10000;i++){
            int rNum = getRandomNum(); //0~9
            cnt[rNum]++;
            // System.out.println("rNum : "+rNum);
        }
        System.out.println(Arrays.toString(cnt)); // 각 숫자가 찍힌 횟수

        printMostNum(cnt);
    }

    public static int getRandomNum(){
        return (int)(Math.random()*10);
    }

    public static void printMostNum(int[] arr){
        int most = 0;
        int mostNum = 0;
        for (int i=0;i<arr.length;i++) {
            if(most<arr[i]) {
                most = arr[i];
                mostNum = i;
            }
        }
        System.out.println("제일 많이 찍힌 값 : "+mostNum+"("+most+"번)");
    }
}
