package chap06.exam09;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam2 {
    public static void main(String[] args) {
        MyList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        
        
        printAll(list);
        System.out.println(list.remove(2));
        printAll(list);

        list.add(2, 90);
        printAll(list);
        
    }

    public static void printAll(MyList list){
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }    
        printLine();
    }

    public static void printLine(){
        System.out.println("===============================");
    }
}
