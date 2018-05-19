package pl.com.zarzadzanieStudent;

import java.util.Scanner;

public class DziekanatTUI {
    private Dziekanat dziekanat;

    private void start(){
        boolean isWorking=true;
        while (isWorking){
            Scanner sc = new Scanner(System.in);

            System.out.println(" 1 - Dodaj nowego studenta");
            System.out.println(" 2 - Wyswietl studenta");
            System.out.println(" 3 - Znajdz studenta po indeksie");
            System.out.println(" 4 - Studenci z danego roku");
            System.out.println(" 5- Usun Studenta");
            String run = sc.nextLine();

            switch (run){
                case "1":
                    System.out.println("nrIndexu ,rokStudiow, sredniaOcen, imie, nazwisko, wiek");
                    dziekanat.dodajStudenta(new Student(
                            sc.nextLine()
                            ,Integer.parseInt(sc.nextLine())
                            ,Double.parseDouble(sc.nextLine())
                            ,sc.nextLine()
                            ,sc.nextLine()
                            ,Integer.parseInt(sc.nextLine())));
            }


        }
    }
}
