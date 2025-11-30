class Main {

    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFascade homeTheater = new HomeTheaterFascade(
            dvd,
            projector,
            sound
        );
        homeTheater.watchMovie("Avatar 3");
    }
}
