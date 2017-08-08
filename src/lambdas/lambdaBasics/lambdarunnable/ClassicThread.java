package lambdas.lambdaBasics.lambdarunnable;

public class ClassicThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("From anonymous inner class runnable");
            }
        });

        thread.run();

    }
}
