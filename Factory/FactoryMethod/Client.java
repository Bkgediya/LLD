class Client {

    public static void main(String[] args) {
        BurgerFactoryMethod factory = new KingFactory();
        Burger burger = factory.createBurger("premium");
        burger.prepare();
    }
}
