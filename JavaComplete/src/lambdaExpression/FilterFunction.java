package lambdaExpression;

@FunctionalInterface
public interface FilterFunction {
    public boolean test(Hotel hotel);

}
//lambda expression works with functional interface where there is only one
// abstract method that requires overriding but can contain multiple no
// of static & default method or can have inherited method also
// inside lambda expression local variable must be final
//We can use Predicate Class  which has test abstract method
//Predicate<Boolean> or Predicate<Integer> or Predicate<List<Integer>>



