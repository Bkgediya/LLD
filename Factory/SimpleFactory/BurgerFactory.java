class BurgerFactory {

    public Burger createBurger(String type) {
        if (type.equals("simple")) {
            return new SimpleBurger();
        } else if (type.equals("premium")) {
            return new PremiumBurger();
        } else if (type.equals("standard")) {
            return new StandardBurger();
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }
    }
}
