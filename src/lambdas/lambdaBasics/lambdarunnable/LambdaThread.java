package lambdas.lambdaBasics.lambdarunnable;

public class LambdaThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("From lambda runnable"));
        thread.run();
    }
}
