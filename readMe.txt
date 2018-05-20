1.1
-stwórz klasę Patient, która będzie przechowywała dane osobowe pacjenta wraz z jego ..::PESELEM::...
-stwórz klasę pl.com.rejestracjaPacjenta.RegistrationDesk, która będzie miała metody addPatient(Patient patient)
oraz getPatient(String pesel).

Dodatkowe*: Klasa registration desk powinna w konstruktorze próbować załadować pacjentów
 z pliku oraz powinna ich zapisywać do pliku przy każdym dodaniu pacjenta
*******************************************************************************************************************
1.2 Napisz aplikację do zarządzania studentami. Będzie działać w podobny sposób,
 co aplikacja z zadania pierwszego. Potrzebne będą klasy:
-Student - klasa reprezentująca studenta. Student powinien mieć swój id
 (np. numer indeksu), rok studiów, średnią ocen i pozostałe dane osobowe
-Dziekanat - klasa analogiczna do klasy pl.com.rejestracjaPacjenta.RegistrationDesk z zadania pierwszego. Powinna mieć metody:
  public void dodajStudenta(Student student) - dodaje studenta do naszej listy
  public Student wybierzStudenta(String numerIndeksu) - zwraca studenta z danym numerem indeksu
  public List<Student> wybierzStudentowZeSredniaNizszaNiz(double srednia) - zwraca liste studentow,
   ktorzy maja srednia nizsza niz podana w 			argumencie metody
  public List<Student> wybierzStudentowZRoku(int rokStudiow) - zwraca liste studentow danego roku
  public boolean usunStudenta(String numerIndeksu) - usuwa studenta z danym numerem indeksu

*Dodaj serializacje studentow do pliku (zapisywanie i odczytywanie, tak jak w zadaniu 1.1)

-stwórz klasę DziekanatTUI, która będzie przechowywać Dziekanat. Klasa powinna mieć metodę start(),
która wyświetli proste menu i będzie pobierała input od użytkownika.
 Użytkownik powinien mieć możliwość dodawania nowych studentów (podając poszczególne informacje
 jedna po drugiej), wyświetlania konkretnego studenta, etc. (wykorzystując resztę metod z Dziekanatu).
  W klasie pl.com.rejestracjaPacjenta.Main powinna zostać tylko stworzona instancja DziekanatTUI
   i wywołana na niej metoda start().
******************************************************************************************************************
   Zadanie 1.3.
   Słownik polsko –angielski.Zaimplementuj słownik polsko –angielski.
   Utwórz klasę Wpis, która będzie zawierała dwa pola typu String –slowoPolskie i slowoAngielskie.
   Następnie utwórz klasę Słownik, zawierającąHashMapę oraz operacje: dodajWpis–metoda dodając
    do mapy gdzie kluczem jest słowo polskie, a wartością słowo angielskie -oraz znajdzTlumaczenie.
   W klasie Main utwórz kilka wpisów i dodaj je do słownika.
   Następnie zaimplementuj interakcję użytkownika z programem.

   *Zapisuj wpisy do pliku i ładuj je z pliku przy załadowaniu aplikacji.
   *****************************************************************************************************************
   Zadanie 1.4. Kalendarz
   Napisz program, który będzie symulował działanie kalendarza z notatkami.
   Kalendarz powinien wspierać operacje takie jak: dodajNotatke, wyswietlNotatki(data), wyswietlWszystkieNotatki.
   Metoda dodajNotatke powinna zapisywać ją do pliku.
   Metoda wyświetlNotatki(data) ma odczytać notatki z plików dla podanego dnia.
   Metoda wyswietlWszystkieNotatki niech wyświetliwszystkie do tej pory zapisane notatki.

   Wskazówki implementacyjne:
   -Klasa Notatka(tytuł, typ, treść, data (LocalDateTime)),
   -Enum typNotatki(np.wydarzenie, spotkanie, święto),
   -Klasa kalendarz –niech zawiera wymienione wyżej operacje oraz atrybut List<Notatka>.


   Zapisywanie wersja 1*: zapisywać każdą notatkę do innego pliku,
   a w miejsce jego nazwy umieszczać datę utworzonej notatki.
    Wszystkie notatki z jednego dnia umieścić w jednym katalogu (nazwakataloguw postaci Daty bez czasu).

   Zapisywanie wersja 2*: zapisuj wszystkie notatki w jednym pliku i przepisuj plik od nowa.

   Obsłuż interakcję z użytkownikiem z poziomu konsoli.