package concurrency;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(Main.class.getName());
        System.out.println("Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        System.out.println("Hello  again from the main thread.");
    }

}


