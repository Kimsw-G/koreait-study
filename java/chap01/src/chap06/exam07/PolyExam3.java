package chap06.exam07;

public class PolyExam3 {

    /*
        부모 = new 자식 //가능
        자식 = new 부모 //불가능
        변수타입 -> 메소드 호출여부만 결정
    */
    public static void main(String[] args) {
        Car car1 = new Bus();
        Car car2 = new Car();
        Car car3 = new LocalBus();

        Bus bus1 = (Bus)car1; // 에러 발생~ ClassCastException
        bus1.openDoor();
        bus1.hoot();


    }
}
