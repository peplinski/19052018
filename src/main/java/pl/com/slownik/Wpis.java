package pl.com.slownik;

public class Wpis {
    private String slowoPolskie;
    private String slowoAngielskie;

    public Wpis(String slowoPolskie, String slowoAngielskie) {
        this.slowoPolskie = slowoPolskie;
        this.slowoAngielskie = slowoAngielskie;
    }

    public String getSlowoPolskie() {
        return slowoPolskie;
    }

    public void setSlowoPolskie(String slowoPolskie) {
        this.slowoPolskie = slowoPolskie;
    }

    public String getSlowoAngielskie() {
        return slowoAngielskie;
    }

    public void setSlowoAngielskie(String slowoAngielskie) {
        this.slowoAngielskie = slowoAngielskie;
    }

    @Override
    public String toString() {
        return slowoPolskie + ":" + slowoAngielskie + " .";
    }
}
