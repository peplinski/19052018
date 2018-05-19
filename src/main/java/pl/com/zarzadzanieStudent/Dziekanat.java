package pl.com.zarzadzanieStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dziekanat {
    private List<Student> studentList = new ArrayList<>();

    public Dziekanat() {
    }

    public void dodajStudenta(Student student){
        if (studentList==null){
            studentList=new ArrayList<>();
        }else {
            studentList.add(student);
        }
    }
    public Optional<Student> wybierzStudenta(String numerIndeksu){
        return studentList.stream()
                .filter(student -> student.getNrIndexu()
                        .equals(numerIndeksu)).findFirst();
    }
    //public List<Student> wybierzStudentowZeSredniaNizszaNiz(double srednia){}
    //public List<Student> wybierzStudentowZRoku(int rokStudiow){}
   // public boolean usunStudenta(String numerIndeksu)


}
