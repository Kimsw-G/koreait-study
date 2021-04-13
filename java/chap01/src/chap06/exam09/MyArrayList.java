package chap06.exam09;

public class MyArrayList<V> implements MyList<V>, Iterable{
    private V[] arr;

    public MyArrayList(){
        Class[] c = new Class[0];
        arr = (V[])c;
    }

    @Override
    public void add(V value){

    }

    @Override
    public int size(){

        return 0;
    }

    @Override
    public int get(int index){

        return 0;
    }

    @Override
    public Iterator<V> iterator() {
        return new RAIterator();
    }
}
