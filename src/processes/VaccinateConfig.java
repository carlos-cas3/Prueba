package src.processes;

import src.entities.Patient;
import src.entities.Vaccine;

import java.util.ArrayList;
import java.util.Iterator;

public class VaccinateConfig {
    ArrayList<Patient> patients = new ArrayList<Patient>();
    ArrayList<Vaccine> vaccines = new ArrayList<Vaccine>();

    public VaccinateConfig() {
        this.patients = new ArrayList<>();
        this.vaccines = new ArrayList<>();
    }

    public void createPatient (Patient patient) {
        this.patients.add(patient);
    }

    public void showPatients () {
        Iterator<Patient> p = this.patients.iterator();
        while(p.hasNext()) {
            Patient patient = p.next();
            System.out.println(patient.toString());
        }
    }

    public void createVaccine (Vaccine vaccine) {
        this.vaccines.add(vaccine);
    }

    public void showVaccines () {
        Iterator<Vaccine> v = this.vaccines.iterator();
        while (v.hasNext()) {
            Vaccine vaccine = v.next();
            System.out.println(vaccine.toString());
        }
    }
}
