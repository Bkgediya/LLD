class WaitExample {

    public static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread is waiting");

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread resumed");
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2 is running");
            synchronized (lock) {
                System.out.println("T2 got lock and notifying");
                lock.notify();
            }
        });

        thread.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        thread2.start();
    }
}
