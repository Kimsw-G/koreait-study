package chap04.exam04;

public class WhileMission2 {
    public static void main(String[] args) {
        int sum = 0;
        int val = 1;

        int cnt = 0;

        while(val!=0){
            val = (int)(Math.random()*11);
            System.out.println("val : "+val);
            sum+=val;
            cnt++;
        }
        System.out.println("값 : " +sum);

        double per = 1;
        for(int i=0;i<cnt;i++){
            per *= (double)10/11;
        }
        System.out.printf("%d번, %.2f%%\n",cnt,per*100);
    }
}
