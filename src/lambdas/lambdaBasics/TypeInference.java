package lambdas.lambdaBasics;

/**
 * Created by manishgiri on 7/9/17.
 */
public class TypeInference {

    interface StringLength {
        public int getStringLength(String s);
    }

    public static void main(String[] args) {
        // Method 1 - state types
        // StringLength stringLengthLambda = (String s) -> s.length();

        // Method 2 - Because Lambda Exp is based off of an interface, compiler can infer the types
        StringLength stringLengthLambda = s -> s.length();
        System.out.println(stringLengthLambda.getStringLength("Hello World"));
    }
}
