class RazorpayAdapter implements PaymentProcessor {

    RazorpayAPI razorpayAPI;

    RazorpayAdapter(RazorpayAPI razorpayAPI) {
        this.razorpayAPI = razorpayAPI;
    }

    @Override
    public void pay(int amount) {
        this.razorpayAPI.makePayment((double) amount);
    }
}
