package pl.com.zarzadzanieStudent;

public class Oceny {
    private Przedmioty przedmioty;
    private int ocena;

    public Oceny(Przedmioty przedmioty, int ocena) {
        this.przedmioty = przedmioty;
        this.ocena = ocena;
    }

    public Przedmioty getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(Przedmioty przedmioty) {
        this.przedmioty = przedmioty;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
