class SleepExample {

    public static void main(String[] args) {
        Object obj = new Object();

        Runnable task = () -> {
            synchronized (obj) {
                System.out.println(
                    Thread.currentThread().getName() + " acquired lock"
                );
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(
                    Thread.currentThread().getName() + " released lock"
                );
            }
        };

        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
    }
}
