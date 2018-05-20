package pl.com.toDo;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Kalendarz kalendarz = new Kalendarz();

        kalendarz.addNotatke(new Notatka("20052018",Typ.WYDARZENIE,"pierwsza notatka",LocalDate.now()));
    }
}
