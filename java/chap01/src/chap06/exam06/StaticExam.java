package chap06.exam06;

public class StaticExam {
    public static void main(String[] args) {
        Toy t1 = new Toy();
        Toy t2 = new Toy();

        System.out.println(t1.name);
        System.out.println(t2.name);

        System.err.println(t1.name);
        System.out.println(Toy.name);

    }
}

class Toy{
    static int name;

    Toy(){
        name++;
    }
}

//hello
