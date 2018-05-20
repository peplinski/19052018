package pl.com.slownik;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Slownik {
    private Map<String, Wpis> slownikPL = new HashMap<>();
    private Map<String, Wpis> slownikEN = new HashMap<>();

    public Slownik() {
        loadFile();
    }

    File plik = new File("slownik.txt");

    public void dodajWpis(Wpis wpis) {
        if (slownikPL == null) {
            slownikPL = new HashMap<>();
            slownikEN = new HashMap<>();
        } else {
            slownikPL.put(wpis.getSlowoPolskie(), wpis);
            slownikEN.put(wpis.getSlowoAngielskie(), wpis);

        }
        saveWord();
    }

    public Optional<Wpis> znajdzTlumaczeniePL(String slowoPL) {
        if (slownikPL.containsKey(slowoPL)) {
            Wpis tlumacz = slownikPL.get(slowoPL);
            return Optional.of(tlumacz);
        }
        return Optional.empty();
    }

    public Optional<Wpis> znajdzTlumaczenieEN(String slowoEN) {
        if (slownikEN.containsKey(slowoEN)) {
            Wpis tlumacz = slownikEN.get(slowoEN);
            return Optional.of(tlumacz);
        }
        return Optional.empty();
    }

    public void translateAll() {
        Set<String> set = slownikEN.keySet();
        List<String> slowa = set.stream().sorted().collect(Collectors.toList());
        for (String klucz : slowa) {
            System.out.println(znajdzTlumaczeniePL(klucz));
        }
    }

    public void saveWord() {
        try {
            PrintWriter printWriter = new PrintWriter(plik);
            slownikPL.entrySet().stream().forEach(slowo -> printWriter.println(slowo));
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(plik));
            bufferedReader.lines().forEach(linia -> {
                //splitujemy
                String[] tablica = linia.split(":");
                Wpis wpis = new Wpis(tablica[0], tablica[1]);
                slownikPL.put(tablica[0], wpis);
                slownikEN.put(tablica[1], wpis);
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
