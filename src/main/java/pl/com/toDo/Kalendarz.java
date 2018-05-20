package pl.com.toDo;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Kalendarz {
    public Kalendarz() {
        loadFile();
    }


    public List<Notatka> notatkaList = new ArrayList<>();
    File file = new File("notatki\\note.txt");


    public void addNotatke(Notatka notatka){
        Optional<Notatka> czyIstnieje = getNotatka(notatka.getText());
        if (czyIstnieje.isPresent()){
            System.out.println("Nie dodało nic do listy lub jest null");
            return;
        }
        if (notatkaList==null){
            notatkaList=new ArrayList<>();
        }else {
            notatkaList.add(notatka);
        }
        saveFile();
    }
    public Optional<Notatka>getNotatka(String t){
        return notatkaList
                .stream()
                .filter(text ->text.getText()
                        .equals(text)).findFirst();
    }
    public void wyswietlNotatki(LocalDate dateTime){
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
                String t1=table[0];
                Typ typ=Typ.valueOf(table[1]);
                String t3=table[2];
                LocalDate dateTime= LocalDate.parse(table[3]);

                Notatka notatka=new Notatka(t1,typ,t3,dateTime );
                notatkaList.add(notatka);
                    });
            bReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void parseDate(){
        try {
           String target = "2018-05-20";
            DateFormat df = new SimpleDateFormat("2018-05-20");
            Date result =  df.parse(target);
            System.out.println(result);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}
/*@Krzysiek wspominałeś, że masz foramt RRRR-MM-DD
a Twoja parser przyjmuje (dd mm rrrr)
LocalDate dateTime=LocalDate.parse(table[3], *DateTimeFormatter.ofPattern("dd mm yyyy*"));*/