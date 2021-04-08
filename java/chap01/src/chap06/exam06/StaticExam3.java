package chap06.exam06;

public class StaticExam3 {
    public static void main(String[] args){
        CalcInstance ci = new CalcInstance();
        int rs = ci.sum(10, 20);
        System.out.println(rs);

        rs = CalcStatic.sum(10, 30);
        System.out.println(rs);
    }
}

class CalcStatic{
    static int sum(int n1, int n2){
        return n1+n2;
    }
}


class CalcInstance{
    int sum(int n1, int n2){
        return n1+n2;
    }
}
