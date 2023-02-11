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
        Iterator<Patient> ip = this.patients.iterator();
        while(ip.hasNext()) {
            Patient patient = ip.next();
            System.out.println(patient.toString());
        }
    }

    public void createVaccine (Vaccine vaccine) {
        this.vaccines.add(vaccine);
    }

    public void showVaccines () {
        Iterator<Vaccine> iv = this.vaccines.iterator();

        while (iv.hasNext()) {
            Vaccine vaccine = iv.next();
            System.out.println(vaccine.toString());
        }
    }
    public boolean patientExist(String nroDoc) {
        Iterator<Patient> ip = this.patients.iterator();
        boolean on = false;
        while(ip.hasNext()) {
            if(ip.next().getnDoc().equals(nroDoc)) {
                on = true;
                break;
            }
        }
        return on;
    }
    public void deletePatient(String nroDoc) {

        if (patientExist(nroDoc)) {
            Patient p = new Patient();
            for (Patient patient : patients) {
                if (patient.getnDoc().equals(nroDoc))
                    p = patient;
            }
            int indexPatient = this.patients.indexOf(p);
            this.patients.remove(indexPatient);
        }
        /*else
            System.out.println("Patient not exist");*/
    }



    }
  /*  public void deleteVaccine() { };*/
