package lambdas.lambdaBasics.typeinference;

/**
 * Created by manishgiri on 7/9/17.
 */
public class TypeInference {

    interface StringLength {
        int getStringLength(String s);
    }

    private static void printLambda(StringLength l) {
        System.out.println(l.getStringLength("Hi"));
    }
    public static void main(String[] args) {
        // Method 1 - state types
         StringLength stringLengthLambda1 = (String s) -> s.length();
         printLambda(stringLengthLambda1);

         // can use inline lambda expression
        printLambda(s -> s.length());

         // Method 2 - Because Lambda Exp is based off of an interface, compiler can infer the types
         StringLength stringLengthLambda2 = s -> s.length();

         System.out.println(stringLengthLambda2.getStringLength("Hello World"));
    }
}
