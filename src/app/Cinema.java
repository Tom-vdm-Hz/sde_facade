package app;

public class Cinema {

    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private Tuner tuner;

    public Cinema(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popcornPopper, Projector projector, Screen screen, TheaterLights theaterLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    public void startMovie(){
popcornPopper.on();
popcornPopper.pop();
theaterLights.on();
theaterLights.dim(1);
screen.down();
projector.on();
projector.wideScreenMode();
amplifier.on();
amplifier.setDvd(dvdPlayer);
amplifier.setSurroundSound();
amplifier.setVolume(5);
dvdPlayer.on();
dvdPlayer.play("Red Notice");
 System.out.println("started movie");
    }

    public void stopMovie(){
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
         System.out.println("stopped movie");
    }

    public void startMusic(){
        theaterLights.on();
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setCd(cdPlayer);
        amplifier.setStereoSound();
        cdPlayer.on();
        cdPlayer.play(3);
         System.out.println("started music");
    }

    public void stopMusic(){
        amplifier.off();
        amplifier.setCd(cdPlayer);
        cdPlayer.eject();
        cdPlayer.off();
         System.out.println("stopped music");
    }

    public void startRadio(){
        tuner.on();
        tuner.setFrequency(2.7);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(tuner);
         System.out.println("started radio");
    }

    public void stopRadio(){
        tuner.off();
        amplifier.off();
         System.out.println("stopped radio");
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public PopcornPopper getPopcornPopper() {
        return popcornPopper;
    }

    public void setPopcornPopper(PopcornPopper popcornPopper) {
        this.popcornPopper = popcornPopper;
    }

    public Projector getProjector() {
        return projector;
    }

    public void setProjector(Projector projector) {
        this.projector = projector;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public TheaterLights getTheaterLights() {
        return theaterLights;
    }

    public void setTheaterLights(TheaterLights theaterLights) {
        this.theaterLights = theaterLights;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
}
