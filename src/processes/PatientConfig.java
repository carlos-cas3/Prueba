package src.processes;

import src.entities.Patient;
import src.entities.Vaccine;

import java.util.ArrayList;
import java.util.Iterator;

public class PatientConfig {
    ArrayList<Patient> patients = new ArrayList<Patient>();
    ArrayList<Vaccine> vaccinesPatient = new ArrayList<Vaccine>();

    public PatientConfig() {
        this.patients = new ArrayList<>();
        this.vaccinesPatient = new ArrayList<>();
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



    //ARREGLAR DE COMO VER A CUAL PACIENTE SE LE AÑADE UNA VACUNA
    public void vaccineForPatient(String nroDoc, Vaccine vaccine) {
        if(patientExist(nroDoc)) {
           // getSpecificPatient(nroDoc).setVaccinesPatient(vaccine);
        }
    }

    /*public void showVaccines () {
        Iterator<Vaccine> iv = this.vaccines.iterator();

        while (iv.hasNext()) {
            Vaccine vaccine = iv.next();
            System.out.println(vaccine.toString());
        }
    }*/
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

    private Patient getSpecificPatient(String nroDoc) {
        Patient p = new Patient();
        for (Patient patient : patients) {
            if (patient.getnDoc().equals(nroDoc)) {
                p = patient;
                break;
            }
        }
        return p;
    }
    public void deletePatient(String nroDoc) {
        if (patientExist(nroDoc)) {
            int indexPatient = this.patients.indexOf(getSpecificPatient(nroDoc));
            this.patients.remove(indexPatient);
        }
    }
    public void allVaccinesForSpecificPatient(String  nroDoc) {
        if(patientExist(nroDoc)) {
            System.out.println(getSpecificPatient(nroDoc).getVaccinesPatient().toString());
            }
            }








    /*public boolean vaccineExist(String kit) {
        Iterator<Vaccine> iv = this.vaccines.iterator();
        boolean on = false;
        while(iv.hasNext()) {
            if(iv.next().getKit().equals(kit)) {
                on = true;
                break;
            }
        }
        return on;
    }*/

/*
    public void deleteVaccine(String kit) {

        if (patientExist(kit)) {
            Vaccine v = new Vaccine();
            for (Vaccine vaccine : vaccines) {
                if (vaccine.getKit().equals(kit))
                    v = vaccine;
            }
            int indexVaccine = this.vaccines.indexOf(v);
            this.vaccines.remove(indexVaccine);
        }
    }
*/

}
