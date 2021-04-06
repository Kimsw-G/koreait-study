package chap06.exam05;

public class Human {
    final static int DEFAULT_AGE = 10;
    final static String DEFAULT_NAME = "미상";
    private int age;
    private String name;

    public Human(){
        this(DEFAULT_NAME,DEFAULT_AGE);
    }

    public Human(String name){
        this(name,DEFAULT_AGE);
    }

    public Human(int age){
        this(DEFAULT_NAME,age);
    }
    
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + "의 나이는 " +this.age +"살 입니다.";
    }

    //생성자 or 메소드로 넣는다

}
