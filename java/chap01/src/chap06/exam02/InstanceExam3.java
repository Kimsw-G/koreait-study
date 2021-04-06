package chap06.exam02;

public class InstanceExam3 {
    public static void main(String[] args) {
        
        int num = 10;

        Box box = new Box();
        box.num = 10;

        changeNum(num);
        System.out.println(num);
        changeBoxNum(box);
        System.out.println(box.num);

        int[] arr = {1,2,3,4};
        changeArr(arr);
        System.out.println(arr[0]);
    }

    public static void changeArr(int[] arr){
        arr[0] = 5;
    }

    public static void changeNum(int num){
        num = 20;
    }

    public static void changeBoxNum(Box box){
        box.num = 20;
    }
}
class Box{
    int num;

}
