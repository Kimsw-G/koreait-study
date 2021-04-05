package chap06.exam01;

import java.util.Arrays;

public class MethodMission9 {
    public static void main(String[] args) {
        int[] arr = {4,8,10,11,45};

        // System.out.println(Arrays.toString(arr));
        System.out.println(selfToString(arr));
    }

    public static String selfToString(int[] arr){
        String rs = "[";
        for(int i=0;i<arr.length;i++){
            rs+=arr[i];
            if(i!=arr.length-1){
                rs+=", ";
            }
        }

        return rs+"]";
    }
}
