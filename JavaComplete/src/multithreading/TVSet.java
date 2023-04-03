package multithreading;

public class TVSet {
    private static volatile TVSet tvSetVolatile=null;
    private TVSet(){
        System.out.println("tv set initiated");
    }

    public static TVSet getTvSetVolatile() {
        if(tvSetVolatile==null){
            synchronized (TVSet.class){//t2 ->double checking
                if(tvSetVolatile==null)return tvSetVolatile=new TVSet();
            }
        }
        return tvSetVolatile;
    }
}
