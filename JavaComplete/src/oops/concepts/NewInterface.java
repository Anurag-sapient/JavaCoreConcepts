package oops.concepts;

interface shape{
    Integer global=10;
    void draw();
    default void m1(){
        System.out.println("this method will show automatically");
    }
    static void name(){
        System.out.println("anurag");
    }
}
interface shape2{
    static void names(){
        System.out.println("anurag");
    }
}
class demo{
    static int y=10;
     static int getNumber(){
        return y;
    }
}
public class NewInterface implements shape,shape2{

    int getNumber() {
        return 1;
    }
    public static void main(String[] args) {
//        shape.global+=2;
    }

    @Override
    public void draw() {

    }
}
