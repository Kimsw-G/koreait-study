package chap05.exam01.sorting;

import java.util.Arrays;

public class Sorter {

    public Sorter(){
    }

    public int[] bubbleSort(int[] nums){

        for(int i=1;i<=nums.length-1;i++){ //i 회전 한 횟수
            for(int j=0; j<nums.length-i;j++){ // 이게 1회전
                if(nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            System.out.println("도는중~ : "+Arrays.toString(nums));
                
            }
            System.out.println("1회전 끝 : "+Arrays.toString(nums));
            System.out.println();
        }
        return nums;

    }




    public static void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
