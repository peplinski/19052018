package pl.com.toDo;


import org.joda.time.LocalDateTime;

public class Notatka {
    private String title;
    private Typ typ;
    private String text;
    private LocalDateTime date;

    public Notatka(String title, Typ typ, String text, LocalDateTime date) {
        this.title = title;
        this.typ = typ;
        this.text = text;
        this.date = date;
    }

    public Notatka() {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notatka{" +
                "title='" + title + '\'' +
                ", typ=" + typ +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
