package lambdas.lambdaBasics.oldpattern;

/**
 * Created by manishgiri on 7/9/17.
 */
public class Greeter {

    /**
     * Accept a greeting of type Greeting and perform it
     * @param greeting
     */
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        // Method 1 - Create an instance of HelloWorldGreeting, which implements Greeting interface
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        // Method 2 - Create an anonymous class that implements the interface (eliminating need for a new class)
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World from Anonymous class.");
            }
        };
        greeter.greet(innerClassGreeting);

        // Method 3 - lambda expression
        Greeting myLambdaExpression = () -> System.out.println("Hello World from Lambda Expression.");
        //greeter.greet(myLambdaExpression);
        myLambdaExpression.perform();



    }



}
