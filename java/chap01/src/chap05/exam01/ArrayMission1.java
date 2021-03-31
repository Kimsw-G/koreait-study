package chap05.exam01;

public class ArrayMission1 {
    public static void main(String[] args) {
        int[] arrInt = new int[20];

        for(int i=0;i<arrInt.length;i++){
            arrInt[i] = 20;
        }

        for (int i : arrInt) {
            System.out.println(i);
        }
    }
}
