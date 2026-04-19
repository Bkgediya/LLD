class Task extends Thread {

    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                taskName + "-" + i + "-" + Thread.currentThread().getName()
            );
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
