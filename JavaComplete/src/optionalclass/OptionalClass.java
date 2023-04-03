package optionalclass;

import java.util.Optional;

public class OptionalClass {
    public void shape(int x){
        System.out.println("");
    }
    public int shape(int x,int y){
        System.out.println("");
        return x;
    }
    public static void main(String[] args) {
//        returns optional.empty string
        Optional<Object>optional=Optional.empty();


//        return optional.empty string
        String email=null;
        Optional<String>emailOptional=Optional.ofNullable(email);
//        if null return default that we are giving
        System.out.println(emailOptional.orElse("no email is there"));

//        if not found will return no such element exception
        System.out.println(emailOptional.get());

//        checking
        if(emailOptional.isPresent()){
            emailOptional.get();
        }
        else{
            System.out.println("empty.......");
        }




    }

}
//helps us in escaping nullpointer exception by giving nullpointerExcetion
// suppose we get null value and we try to find that null array length
//which will give us nullpointer exception

