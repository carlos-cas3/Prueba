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
        configPatient.createPatient(new Patient("Carlos","Castillo",123,"DNI","7095123","p1234"));
        configPatient.createPatient(new Patient("Jesus","Flores",123,"DNI","2595423","p2134"));
        configPatient.createPatient(new Patient("Fernando","Martinez",123,"DNI","9495123","p3214"));
        //CREATION VACCINES
        configPatient.createVaccine(new Vaccine("Pfizer","123","1"));
        configPatient.createVaccine(new Vaccine("Moderna","213","2"));
        configPatient.createVaccine(new Vaccine("Astrazeneca","323","3"));

        Patient p2 = new Patient("ab","cd",12,"ef","gh","ij");



        /*System.out.println(configPatient.patientExist(p2));
        configPatient.deletePatient(get)*/


        /*ArrayList<Patient> pat = new ArrayList<>();
        pat.add(new Patient("Carlos","Castillo",123,"DNI","7095123","p1234"));
        pat.add(new Patient("Jesus","Flores",123,"DNI","2595423","p2134"));
        pat.add(new Patient("Fernando","Martinez",123,"DNI","9495123","p3214"));
        pat.add(new Patient("ab","cd",12,"ef","gh","ij"));
        pat.add(new Patient("qw","er",5,"ty","ui","io"));
        */



        //INTERACCION


    }
}
