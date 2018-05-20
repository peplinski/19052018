package pl.com.rejestracjaPacjenta;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistrationDesk {
    public RegistrationDesk() {
        loadPacjentow();
    }

    private List<Pacjent> pacjentList = new ArrayList<Pacjent>();
    File plik = new File("rejestracja.txt");


    public void addPacjent(Pacjent pacjent) {
//szukam pacjeta jesli obecny to nie dodaje
        Optional<Pacjent> szukany = getPacjent(pacjent.getPesel());
        if (szukany.isPresent()) {
            System.out.println("Pacjent znaleziony, nie dodaje");
            return;
        }
//dodaję pacjenta
        if (pacjentList == null) {
            pacjentList = new ArrayList<>();
        } else {
            pacjentList.add(pacjent);
        }
        savePacjentow();
    }

    public Optional<Pacjent> getPacjent(String pesel) {
        return pacjentList.stream()
                .filter(pacjent -> pacjent.getPesel()
                        .equals(pesel)).findFirst();
    }

    public void savePacjentow() {
        try {
            PrintWriter printWriter = new PrintWriter(plik);
            pacjentList.stream().forEach(pacjent -> printWriter.println(pacjent));
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void loadPacjentow() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(plik));
            bufferedReader.lines().forEach(linia -> {
                //split
                String[] tablica = linia.split(";");
                //dodanie pacjentow
                addPacjent(new Pacjent(tablica[0], tablica[1], tablica[2]));
            });
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
