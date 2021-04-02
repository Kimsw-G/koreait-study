package chap06.exam01;

import java.util.TreeSet;

public class MethodMission1 {
    public static void main(String[] args) {
        whoIsBig(10,30,100); // 콘솔에 "100이 가장 큽니다."
        whoIsBig(10,9,3); //콘솔에 10이 가장 큽니다.
        whoIsBig(7, 15);
    }

    

    public static int whoIsBig(int a, int b, int c){ // 3
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(a);
        tree.add(b);
        tree.add(c);

        return getBiggest(tree.last());
    }

    public static int whoIsBig(int a, int b){ // 2
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(a);
        tree.add(b);
        return getBiggest(tree.last());
    }

    public static int getBiggest(int max){
        System.out.println(max + "이(가) 가장 큽니다.");
        return max;
    }
}
