package chap06.exam08.absExam1;

public abstract class Animal {
    private int age;
    private String name;

    public abstract void howling();
}

class Cat extends Animal{

    @Override
    public void howling(){
        System.out.println("야옹");
    }
}