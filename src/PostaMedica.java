package src;

import src.entities.Patient;
import src.entities.Vaccine;
import src.processes.VaccinateConfig;

import java.util.ArrayList;
import java.util.Iterator;

public class PostaMedica {
    public static void main(String[] args) {
        VaccinateConfig configPatient = new VaccinateConfig();

        //CREATION PATIENTS
        configPatient.createPatient(new Patient("Carlos","Castillo",123,"DNI","12","p1234"));
        configPatient.createPatient(new Patient("Jesus","Flores",123,"DNI","23","p2134"));
        configPatient.createPatient(new Patient("Fernando","Martinez",123,"DNI","34","p3214"));
        //CREATION VACCINES
        configPatient.createVaccine(new Vaccine("Pfizer","123","1"));
        configPatient.createVaccine(new Vaccine("Moderna","213","2"));
        configPatient.createVaccine(new Vaccine("Astrazeneca","323","3"));

        configPatient.showPatients();

        System.out.println();

        configPatient.deletePatient("12");
        configPatient.showPatients();

        System.out.println();

        configPatient.deletePatient("56");

        System.out.println();
        configPatient.showPatients();

        //INTERACCION


    }
}
