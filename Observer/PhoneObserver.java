class PhoneObserver implements Observer {

    @Override
    public void update(int value) {
        System.out.println("PhoneObserver received value: " + value);
    }
}
