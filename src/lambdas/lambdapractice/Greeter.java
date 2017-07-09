package lambdas.lambdapractice;

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

        // Create an instance of HelloWorldGreeting, which implements Greeting interface
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
    }

}
