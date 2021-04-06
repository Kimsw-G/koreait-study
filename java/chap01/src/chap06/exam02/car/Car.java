package chap06.exam02.car;

public class Car {
    String name;
    int cc;

    public Car(String name, int cc){
        this.name = name;
        this.cc = cc;
    }

    void drive(){
        System.out.printf("%s는 달린다.\n",this.name);
    }

    void stop(){
        System.out.printf("%s는 멈춘다...\n",this.name);
    }
}
