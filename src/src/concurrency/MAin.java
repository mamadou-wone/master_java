package concurrency;

public class MAin {

    public static void main(String[] args) {
        System.out.println("Amir Boss");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        System.out.println("You r awesome");
    }

}


