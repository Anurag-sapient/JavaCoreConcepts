package methodreference;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
@FunctionalInterface
interface Printable{
    void print(String msg);
}
public class MethodReferenceDemo {


    public static void display(String msg){
        System.out.println(msg);
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Function<Integer,Double> lambda=(i)->  Math.sqrt(i);
        lambda.apply(2);
        Function<Integer,Double> lambda1=Math::sqrt;

//       because it has two arguements
        BiFunction<Integer,Integer,Integer>sum=MethodReferenceDemo::sum;


        Printable print=(msg)->MethodReferenceDemo.display(msg);
        Printable print2=MethodReferenceDemo::display;
        print2.print("string");

    }
}
//Method Reference is used to reference method of functional interface
//which is compact and easy way if one is referring just the method
//types->
// static method class::staticMethodName
//Object Instance object::methodName or class::methodName
//
