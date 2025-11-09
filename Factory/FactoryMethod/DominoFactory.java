class DominoFactory implements BurgerFactoryMethod {

    @Override
    public Burger createBurger(String type) {
        if (type.equals("Premium")) {
            return new PremiumWheatBurger();
        } else if (type.equals("Regular")) {
            return new RegularWheatBurger();
        } else if (type.equals("Vegan")) {
            return new VeganWheatBurger();
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }
    }
}
