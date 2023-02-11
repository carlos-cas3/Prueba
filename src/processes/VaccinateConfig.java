package src.processes;

import src.entities.Patient;
import src.entities.Vaccine;

import java.util.ArrayList;
import java.util.Iterator;

public class VaccinateConfig {
    ArrayList<Patient> patients = new ArrayList<Patient>();
    ArrayList<Vaccine> vaccines = new ArrayList<Vaccine>();
    Iterator<Patient> ip = this.patients.iterator();
    Iterator<Vaccine> iv = this.vaccines.iterator();

    public VaccinateConfig() {
        this.patients = new ArrayList<>();
        this.vaccines = new ArrayList<>();
    }

    public void createPatient (Patient patient) {
        this.patients.add(patient);
    }

    public void showPatients () {
        while(ip.hasNext()) {
            Patient patient = ip.next();
            System.out.println(patient.toString());
        }
    }

    public void createVaccine (Vaccine vaccine) {
        this.vaccines.add(vaccine);
    }

    public void showVaccines () {

        while (iv.hasNext()) {
            Vaccine vaccine = iv.next();
            System.out.println(vaccine.toString());
        }
    }
    public boolean patientExist(String nroDoc) {
        boolean on = false;
        while(ip.hasNext()) {
            if(ip.next().getnDoc().equals(nroDoc)) {
                on = true;
            }
        }
        return on;
    }
    public void deletePatient(String nroDoc) {

        if(patientExist(nroDoc)) {
            Patient p = new Patient();
            
            patients.remove(p);
        }

        }

    }
  /*  public void deleteVaccione() { };*/
