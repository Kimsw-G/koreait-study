package chap05.exam01;

public class ArrayMission2 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] arr = new int[LEN];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }//1~10값 대입

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
    