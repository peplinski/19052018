package pl.com.rejestracjaPacjenta;

import pl.com.rejestracjaPacjenta.Pacjent;
import pl.com.rejestracjaPacjenta.RegistrationDesk;

public class Main {
    public static void main(String[] args) {
        RegistrationDesk registrationDesk = new RegistrationDesk();

        registrationDesk.addPacjent(new Pacjent("11111","Wojciech","Kalina"));
        registrationDesk.addPacjent(new Pacjent("22222","Wojciech","Kalina"));
        registrationDesk.addPacjent(new Pacjent("44444","Wojciech","Kalina"));
        registrationDesk.addPacjent(new Pacjent("55555","Wojciech","Malina"));
        registrationDesk.addPacjent(new Pacjent("33333","Halina","Kalina"));
        registrationDesk.addPacjent(new Pacjent("66666","Wojciech","Kalina"));

    }
}
