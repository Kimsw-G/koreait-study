package chap06.exam07;

public class Car {
    
    public void hoot(){
        System.out.println("빵빵");
    }

}

class Bus extends Car{ 

    void openDoor(){
        System.out.println("승객문을 연다!");
    }

}

class LocalBus extends Bus{
    @Override
    void openDoor(){
        System.out.println("승객문을 연다?");
    }
}

class Truck extends Car{

    @Override
    public void hoot(){
        System.out.println("truck bang bang");
    }
}