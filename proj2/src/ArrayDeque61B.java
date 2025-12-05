import java.util.List;

public class ArrayDeque61B<T> implements Deque61B {
    T[] backingArr;
    int nextFirst;
    int nextLast;
    public ArrayDeque61B(){
        this.backingArr = (T[]) new Object[8];
        this.nextFirst = 0;
        this.nextLast = 1;
    }
    public static void main(String[] args) {
        
    }

    private void resize(int size){
        T[] new_arr = (T[]) new Object[size];
        nextFirst += 1;
        int i = 1;
        while(nextFirst != nextLast){
            new_arr[i] = backingArr[nextFirst];
            i += 1;
            nextFirst += 1;
        }
        nextFirst = 0;
        nextLast = i;
        backingArr = new_arr;

    }

    @Override
    public void addFirst(Object x) {
        // TODO Auto-generated method stub
        if (this.size() == backingArr.length - 1){
            this.resize(backingArr.length * 2);
        }
        backingArr[nextFirst] =(T) x;
        nextFirst = ((nextFirst - 1) + this.backingArr.length) % this.backingArr.length; 
    }

    @Override
    public void addLast(Object x) {
        // TODO Auto-generated method stub
        if (this.size() == backingArr.length - 1){
            this.resize(backingArr.length * 2);
        }
        backingArr[nextLast] = (T) x;
        nextLast = (nextLast + 1) % this.backingArr.length;
    }

    @Override
    public List toList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toList'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public Object removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public Object removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public Object get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Object getRecursive(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecursive'");
    }


}
