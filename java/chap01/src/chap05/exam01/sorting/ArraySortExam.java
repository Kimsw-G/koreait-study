package chap05.exam01.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ArraySortExam {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<Integer>();
        int[] arr2 = new int[5];
        for(int i=1;i<=arr2.length;i++){
            hash.add(i);
        }
            
        Iterator<Integer> it = hash.iterator();
            
        while(it.hasNext()){
            System.out.println(it.next());
        }
            
        // int[] arr = {500,8,7,3,100,35,78,23,11};
        // System.out.println(Arrays.toString(arr));

        // Sorter sorter = new Sorter();

        // arr = sorter.bubbleSort(arr);
        // System.out.println(Arrays.toString(arr));

    }
}
