package chap06.exam02.car;

public class InstanceExam5 {
    public static void main(String[] args) {
        Car[] carArr = new Car[5];
        carArr[0] = new Car("bongo", 2000);
        System.out.println(carArr[0].toString());

        
    }
}
