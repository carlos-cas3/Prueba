package src.processes;

import src.entities.Patient;
import src.entities.Vaccine;

import java.util.ArrayList;
import java.util.Iterator;

public class PatientConfig {
    ArrayList<Patient> patients = new ArrayList<Patient>();

    public PatientConfig() {
        this.patients = new ArrayList<>();
    }

    public void createPatient (Patient patient) {
        this.patients.add(patient);
    }

    public void showAllPatients () {
        for (Patient patient : this.patients) {
            System.out.println(patient.toString());
        }
    }

    public boolean specificPatientExist(String nroDoc) {
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
    public void deleteSpecificPatient(String nroDoc) {
        if (specificPatientExist(nroDoc)) {
            int indexPatient = this.patients.indexOf(getSpecificPatient(nroDoc));
            this.patients.remove(indexPatient);
        }
    }
    //ARREGLAR DE COMO VER A CUAL PACIENTE SE LE AÑADE UNA VACUNA
    //ERROR IF VACCINE BE USE IN ONE PATIENT, THEN ANOTHER PATIENT NO USE THE SAME VACCINE
    public void vaccineForPatient(String nroDoc, Vaccine vaccine) {
        if(specificPatientExist(nroDoc)) {
            getSpecificPatient(nroDoc).setVaccinesPatient(vaccine);
            //elimino la vacuna y listo :u
            getSpecificPatient(nroDoc);
            // getSpecificPatient(nroDoc).setVaccinesPatient(vaccine);
        }
    }
    public void elimantevaccineForSpecificPatient(String nroDoc,String kit) {
        if(specificPatientExist(nroDoc)) {
                getSpecificPatient(nroDoc).getVaccinesPatient().remove(specificVaccineForPatient(nroDoc,kit));
        }
    }
    public Vaccine specificVaccineForPatient(String nroDoc, String kit) {
        Vaccine v = new Vaccine();

        if(specificPatientExist(nroDoc)) {
            for(Vaccine vaccine : getSpecificPatient(nroDoc).getVaccinesPatient()) {
                if(vaccine.getKit().equals(kit)) {
                    v = vaccine;
                    break;
                }
            }
        }
        return v;
    }
    public void allVaccinesForSpecificPatient(String  nroDoc) {
        if(specificPatientExist(nroDoc)) {
            System.out.println(getSpecificPatient(nroDoc).getVaccinesPatient().toString());
            }
    }

    //quieroque en este metodo se me permite crear un arraylist teniendo todas las vacunas
    public void showAllVaccines() {
        ArrayList<Vaccine> arrayVaccines = new ArrayList<>();
        Iterator<Patient> ip = this.patients.iterator();
        while(ip.hasNext()) {
            System.out.println(ip.next().getVaccinesPatient());
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
