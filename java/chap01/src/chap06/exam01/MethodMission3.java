package chap06.exam01;

public class MethodMission3 {
    public static void main(String[] args) {
        sumAllFromTo(5,10);
    }

    public static void sumAllFromTo(int startN, int endN){ // 모든 합
        int sum=0;
        for(int i=startN; i<endN;i++){
            sum+=i;
        }
        System.out.println(sum);
    }   
}
