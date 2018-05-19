1.1
-stwórz klasę Patient, która będzie przechowywała dane osobowe pacjenta wraz z jego ..::PESELEM::...
-stwórz klasę pl.com.rejestracjaPacjenta.RegistrationDesk, która będzie miała metody addPatient(Patient patient)
oraz getPatient(String pesel).

Dodatkowe*: Klasa registration desk powinna w konstruktorze próbować załadować pacjentów
 z pliku oraz powinna ich zapisywać do pliku przy każdym dodaniu pacjenta

2.1 Napisz aplikację do zarządzania studentami. Będzie działać w podobny sposób,
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