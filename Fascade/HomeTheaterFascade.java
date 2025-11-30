class HomeTheaterFascade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFascade(
        DVDPlayer dvdPlayer,
        Projector projector,
        SoundSystem soundSystem
    ) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        projector.setWidescreenMode();
        soundSystem.on();
        soundSystem.setSurroundSound();
    }
}
