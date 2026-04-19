class Main {

    public static void main(String[] args) throws InterruptedException {
        // thread1
        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");
        t1.start();
        t2.start();

        Thread thread3 = new Thread(new RunThread());
        thread3.start();
        Thread t4 = new Thread(() ->
            System.out.println(
                "Lambda thread on:" + Thread.currentThread().getName()
            )
        );
        t4.start();

        // wait for thread to finish before continuing
        t1.join();
        t2.join();
        System.out.println("All threads done.");
    }
}
