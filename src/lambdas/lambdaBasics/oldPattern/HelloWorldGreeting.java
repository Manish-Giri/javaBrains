package lambdas.lambdaBasics.oldPattern;

/**
 * Created by manishgiri on 7/9/17.
 */
public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}
