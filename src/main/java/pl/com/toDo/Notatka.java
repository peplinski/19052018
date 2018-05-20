package pl.com.toDo;




import java.time.LocalDate;

public class Notatka {
    private String title;
    private Typ typ;
    private String text;
    private LocalDate date;

    public Notatka(String title, Typ typ, String text, LocalDate date) {
        this.title = title;
        this.typ = typ;
        this.text = text;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return title+
                "#" + typ +
                "#" + text+
                "#" + date ;
    }
}
