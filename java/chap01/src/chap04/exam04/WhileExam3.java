package chap04.exam04;

public class WhileExam3 {
    public static void main(String[] args) {
        int val=0 ,sum=0, cnt=0;
        do{
            val = (int)(Math.random()*11);
            System.out.println("val : " + val);
            sum += val;
            cnt++;
        }while(val != 0);
        
        System.out.println("값 : " +sum);

        double per = 1;
        for(int i=0;i<cnt;i++){
            per *= (double)10/11;
        }
        System.out.printf("%d번, %.2f%%\n",cnt,per*100);
    }
}
