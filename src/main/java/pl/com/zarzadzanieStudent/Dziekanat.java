package pl.com.zarzadzanieStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Dziekanat {
    private List<Student> studentList = new ArrayList<>();
    File plik = new File("studenci.txt");

    public Dziekanat() {
    }

    public void dodajStudenta(Student student) {
        Optional<Student> jesliIstnieje = wybierzStudenta(student.getNrIndexu());
        if (jesliIstnieje.isPresent()) {
            System.out.println("Student istnieje, nie dodaję");
            return;
        }

        if (studentList == null) {
            studentList = new ArrayList<>();
        } else {
            studentList.add(student);
        }
        saveStudenta();
    }

    public Optional<Student> wybierzStudenta(String numerIndeksu) {
        return studentList.stream()
                .filter(student -> student.getNrIndexu()
                        .equals(numerIndeksu)).findFirst();
    }

    public List<Student> wybierzStudentowZRoku(int rokStudiow) {
        return studentList
                .stream()
                .filter(student -> student.getRokStudiow() == rokStudiow)
                .collect(Collectors.toList());

    }

    public boolean usunStudenta(String numerIndeksu) {
        ///przypisanie studenta do zmiennej
        Optional<Student> temp = wybierzStudenta(numerIndeksu);
        //jesli student istnieje
        if (temp.isPresent()) {
            //usuwam studenta z listy wyciagajac z optionala
            studentList.remove(temp.get());
            return true;
        }
        return false;
    }

    public void saveStudenta() {
        try {
            PrintWriter printWriter = new PrintWriter(plik);
            studentList.stream().forEach(pacjent -> printWriter.println(pacjent));
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
                //dodanie studenta nrIndexu +
                //                ";" + rokStudiow +
                //                ";" + sredniaOcen +
                //                ";" + imie +
                //                ";" + nazwisko +
                //                ";" + wiek;
                dodajStudenta(new Student(
                        tablica[0],
                        Integer.parseInt(tablica[1]),
                        Double.parseDouble(tablica[2]),
                        tablica[3],
                        tablica[4],
                        Integer.parseInt(tablica[5])));
            });
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
