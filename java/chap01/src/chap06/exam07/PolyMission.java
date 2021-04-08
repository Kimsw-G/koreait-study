package chap06.exam07;


public class PolyMission {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Pig pig = new Pig();
        Animal ham = new Hamster();

        cry(cat);
        cry(pig);
        cry(ham);
    }

    public static void cry(Animal ani){
        ani.howling();
    }
}

class Pig extends Animal{

    @Override
    void howling(){
        System.out.println("꿀꿀");
    }
}

class Hamster extends Animal{

    @Override
    void howling(){
        System.out.println("찍찍");
    }
}