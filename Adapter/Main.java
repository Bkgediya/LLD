class Main {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new RazorpayAdapter(
            new RazorpayAPI()
        );
        paymentProcessor.pay(100);
    }
}
