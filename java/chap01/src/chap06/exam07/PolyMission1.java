package chap06.exam07;


public class PolyMission1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Pig pig = new Pig();
        Animal ham = new Hamster("찍찍이");

        // Hamster ham_ = (Hamster)ham;
        // ham_.runRail();

        System.out.println(ham instanceof Hamster);

        cry(cat);
        cry(pig);
        cry(ham);
    }

    public static void cry(Animal ani){ //ani로 햄스터가 들어올시 howling대신 runRail 실행
        if(ani instanceof Hamster){
            Hamster ham = (Hamster)ani;
            ham.runRail();
        }else{
            ani.howling();
        }
    }
}

class Pig extends Animal{

    @Override
    void howling(){
        System.out.println("꿀꿀");
    }
}

class Hamster extends Animal{

    String name;
    
    public Hamster(String name){
        this.name = name;
    }

    @Override
    void howling(){
        System.out.println("찍찍");
    }

    void runRail(){
        System.err.println(this.name +": 쳇바퀴를 굴린다");
    }
}