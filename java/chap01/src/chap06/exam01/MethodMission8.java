package chap06.exam01;

public class MethodMission8 {
    public static void main(String[] args) {
        gugudan(4,8);
    }

    public static void gugudan(int dan){
        for(int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
    }

    public static void gugudan(int s,int e){
        for(int i=s;i<=e;i++){
            gugudan(i);
            printLine();
        }
    }

    public static void printLine(){
        System.out.println("==================");
    }
}
