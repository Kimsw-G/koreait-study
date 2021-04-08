package chap06.exam06;

public class StaticExam4 {
    public static void main(String[] args){
        CalcInstance2 ci = new CalcInstance2();
        ci.n1 = 10;
        ci.n2 = 20;
        System.out.println(ci.sum());
    }
}

class CalcStatic1{
    static int n1;
    static int n2;

    static int sum(){
        return n1+n2;
    }
}


class CalcInstance2{
    int n1;
    int n2;
    int sum(){
        return n1+n2;
    }
}
