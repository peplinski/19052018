package pl.com.zarzadzanieStudent;

import java.util.List;
import java.util.Scanner;

public class TUI {
    private Dziekanat dziekanat=new Dziekanat();

    public void start() {
        boolean isWorking = true;
        while (isWorking) {
            Scanner sc = new Scanner(System.in);

            System.out.println(" 1 - Dodaj nowego studenta");
            System.out.println(" 2 - Wyswietl studenta");
            System.out.println(" 3 - Znajdz studenta po indeksie");
            System.out.println(" 4 - Studenci z danego roku");
            System.out.println(" 5 - Usun Studenta");
            System.out.println(" 6 - Wyjscie");
            String run= sc.nextLine();

            switch (run) {
                case "1":
                    System.out.println("nrIndexu ,rokStudiow, sredniaOcen, imie, nazwisko, wiek");
                    dziekanat.dodajStudenta(new Student(
                            sc.nextLine()
                            , Integer.parseInt(sc.nextLine())
                            , Double.parseDouble(sc.nextLine())
                            , sc.nextLine()
                            , sc.nextLine()
                            , Integer.parseInt(sc.nextLine())));
                    break;
                case "2":
                    dziekanat.wyszukajStudenta(sc.nextLine());
                    break;
                case "3":
                    dziekanat.wyszukajStudenta(sc.nextLine());
                    break;
                case "4":
                  List<Student> x= dziekanat.wybierzStudentowZRoku(Integer.parseInt(sc.nextLine()));
                    System.out.println(x);
                    break;
                case "5":
                    dziekanat.usunStudenta(sc.nextLine());
                    break;
                case "6":
                    isWorking=false;
            }
        }
    }
}
