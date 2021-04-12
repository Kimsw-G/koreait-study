package chap06.exam07;

public class PolyMission2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Bus();
        Car car3 = new LocalBus();
        Car car4 = new Truck();
    
        blowKlaxon(car1);
        blowKlaxon(car2);
        blowKlaxon(car3);
        blowKlaxon(car4);
        
    }

    public static void blowKlaxon(Car car){
        if(car instanceof Bus){
            ((Bus)car).openDoor();
        }else{
            car.hoot();
        }
    }
}
