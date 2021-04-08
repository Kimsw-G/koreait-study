package chap06.exam07;

public class InheriExam {
    public static void main(String[] args) {
        Animal cat = new Cat();

        cat.howling();
    }
}

class Animal{
    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void howling(){
        System.out.printf("%s[%d살]가 운다",this.name,this.age);
    }
}

class Cat extends Animal{

    static String nm = "hello";
    static int ag = 8;

    Cat() {
        super(nm, ag);
    }
    
    @Override
    void howling(){
        System.out.print("고양이 ");
        
        super.howling();
    }

    
}
