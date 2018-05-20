package pl.com.toDo;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kalendarz {
    private LocalDate localDate;
    Notatka notatka = new Notatka();

    public Kalendarz() {
        loadFile();
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    private List<Notatka> notatkaList = new ArrayList<>();
    File file = new File("notatki\\", String.valueOf(this.localDate));


    public void addNotatke(Notatka notatka){
        if (notatkaList==null){
            notatkaList=new ArrayList<>();
        }else {
            notatkaList.add(notatka);
        }
        saveFile();
    }
    public void wyswietlNotatki(LocalDateTime dateTime){
        notatkaList
                .stream()
                .filter(notatka -> notatka.getDate()==dateTime)
                .collect(Collectors.toList());
    }
    public void wyswietlWszystkieNotatki(){
        notatkaList
                .stream()
                .forEach(notatka -> System.out.println());
    }

    public void saveFile(){
        try {
            PrintWriter printWriter = new PrintWriter(file);
            notatkaList
                    .stream()
                    .forEach(notatka -> printWriter.println(notatka));
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadFile(){
        try {
            BufferedReader bReader= new BufferedReader(new FileReader(file));
            bReader.lines().forEach(linia->{
                //split
                String[] table=linia.split("#");
                Notatka notatka=new Notatka(table[0],table[1],table[2],table[4])
                notatkaList.add(notatka);
                    });
            bReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
