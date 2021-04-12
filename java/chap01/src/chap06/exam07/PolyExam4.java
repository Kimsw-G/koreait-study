package chap06.exam07;

public class PolyExam4 {
    public static void main(String[] args) {
        Car car1 = new LocalBus();
        LocalBus lb1 = (LocalBus)car1;
        System.out.println(car1 instanceof LocalBus);

        Bus bus1 = (Bus)car1;
        System.out.println(car1 instanceof Bus);

        

    }
}
