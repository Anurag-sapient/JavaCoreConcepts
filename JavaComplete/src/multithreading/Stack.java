package multithreading;

public class Stack {
    int []array;
    int stackTop;

    public Stack(int capacity) {
        array=new int[capacity];stackTop=-1;
    }
    public synchronized boolean push(int element){
        if(isFull())return false;
        stackTop++;
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){}
        array[stackTop]=element;
        return true;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }
    public boolean isFull(){
        return array.length<=stackTop;
    }
    public synchronized int pop(){
        if(isEmpty())return Integer.MIN_VALUE;
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){}
        int obj=array[stackTop];
        stackTop--;
        return obj;
    }
}
