package chap06.exam09;

import java.lang.reflect.Array;

public class MyArrayList implements MyList{
    private int[] arr;

    public MyArrayList(){
        arr = new int[0];
    }

    @Override
    public void add(int value){
        add(arr.length,value); 
    }
    @Override
    public void add(int index, int value){
        int[] tmp = new int[arr.length+1];
        for(int i=0,j=0;j<arr.length;i++,j++){
            if(i==index)i++;
            tmp[i] = arr[j];
        }
        tmp[index] = value;
        arr = tmp;
    }

    
    @Override
    public int size(){
        return arr.length;
    }
    
    @Override
    public int remove(int index){
        int rs = arr[index];
        int[] tmp = new int[arr.length-1];
        for(int i=0,j=0;j<arr.length;i++,j++){
            if(j==index)j++;
            tmp[i] = arr[j];
        }
        arr = tmp;
        return rs;
    }
    @Override
    public int remove(){
        return remove(arr.length-1);
    }

    @Override
    public int get(int index){
        return arr[index];
    }

}
// a 0 1 2 3 4
// j 0 1 3 4
// i 0 1 2 3