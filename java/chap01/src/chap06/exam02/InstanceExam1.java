package chap06.exam02;

public class InstanceExam1 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark();
        dog.name = "boby";

        Dog dog2 = new Dog();
        dog.name = "dolsa";
    }
}

class Dog{
    String name;
    int age;

    void bark(){
        System.out.println("bowwow");
    }
}