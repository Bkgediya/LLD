class TVObserver implements Observer {

    @Override
    public void update(int value) {
        System.out.println("TVObserver received value: " + value);
    }
}
