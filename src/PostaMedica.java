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


        Vaccine v = new Vaccine();
        //configVaccinate.vaccineForPatient(v);
        configVaccinate.allVaccinesForSpecificPatient("12");
        /*Patient p = new Patient("Carlos", "Castillo", 123, "DNI", "12", "p1234", new ArrayList<Vaccine>());
        Vaccine v2 = new Vaccine();

        p.vaccineForPatient(v);
        p.vaccineForPatient(v2);
        configVaccinate.createPatient(p);
        configVaccinate.showPatients();*/
        //INTERACCION



    }
}
