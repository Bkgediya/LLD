class Main {

    public static void main(String[] args) {
        Observable subject = new Observable();

        Observer phone = new PhoneObserver();
        Observer tv = new TVObserver();

        subject.attach(phone);
        subject.attach(tv);

        subject.setValue(10);
        subject.setValue(20);
    }
}
