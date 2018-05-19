package pl.com.zarzadzanieStudent;

public class Student {
    private String nrIndexu;
    private int rokStudiow;
    private double sredniaOcen;
    private String imie;
    private String nazwisko;
    private int wiek;

    public Student(String nrIndexu, int rokStudiow, double sredniaOcen, String imie, String nazwisko, int wiek) {
        this.nrIndexu = nrIndexu;
        this.rokStudiow = rokStudiow;
        this.sredniaOcen = sredniaOcen;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getNrIndexu() {
        return nrIndexu;
    }

    public void setNrIndexu(String nrIndexu) {
        this.nrIndexu = nrIndexu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrIndexu=" + nrIndexu +
                ", rokStudiow=" + rokStudiow +
                ", sredniaOcen=" + sredniaOcen +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
