class KingFactory implements BurgerFactoryMethod {

    @Override
    public Burger createBurger(String type) {
        if (type.equals("premium")) {
            return new PremiumWheatBurger();
        } else if (type.equals("standard")) {
            return new StandardWheateBurger();
        } else if (type.equals("simple")) {
            return new BasicWheateBurger();
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }
    }
}
