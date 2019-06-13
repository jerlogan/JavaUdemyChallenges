package Interfaces;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch(boolean clutchIsIn) {
        this.clutchIsIn = clutchIsIn;
    }
}
