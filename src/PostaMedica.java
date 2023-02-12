package src;

import src.entities.Patient;
import src.entities.Vaccine;
import src.processes.PatientConfig;

import java.util.ArrayList;

public class PostaMedica {
    public static void main(String[] args) {
        PatientConfig configVaccinate = new PatientConfig();


        //CREATION PATIENTS with vaccines
        configVaccinate.createPatient(new Patient("Carlos","Castillo",123,"DNI","12","p1234", new ArrayList<Vaccine>()));
        configVaccinate.createPatient(new Patient("Jesus","Flores",123,"DNI","23","p2134",new ArrayList<Vaccine>()));
        configVaccinate.createPatient(new Patient("Fernando","Martinez",123,"DNI","34","p3214",new ArrayList<Vaccine>()));

        // public Vaccine(String name, String kit, String lot)

        Vaccine v1 = new Vaccine("Pfizer","12","012");
        Vaccine v2 = new Vaccine("Moderna","23","023");
        Vaccine v3 = new Vaccine("Astrazeneca","45","045");
        Vaccine v4 = new Vaccine("Moderna","78","078");
        Vaccine v5 = new Vaccine("Pfizer","91","091");
        //configVaccinate.vaccineForPatient(v);


        configVaccinate.vaccineForPatient("12",v1);
        configVaccinate.vaccineForPatient("12",v2);
        configVaccinate.allVaccinesForSpecificPatient("12");

        System.out.println();
        configVaccinate.vaccineForPatient("23",v1);
        configVaccinate.allVaccinesForSpecificPatient("23");


        //INTERACCION



    }
}
