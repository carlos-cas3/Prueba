package src.entities;

import src.processes.PatientConfig;

import java.util.ArrayList;
import java.util.Iterator;

public class Patient extends Person {
    private String codPatient;
    private ArrayList<Vaccine> vaccinesPatient;

    public Patient() { }

    public Patient(String name, String lastname, int age, String typeDoc, String nDoc, String codPatient, ArrayList<Vaccine> vaccinesPatient) {
        super(name, lastname, age, typeDoc, nDoc);
        this.codPatient = codPatient;
        this.vaccinesPatient = vaccinesPatient;
    }

    /*public void vaccineForPatient(Vaccine vaccine) {
        vaccinesPatient.add(vaccine);
    }*/

    public String getCodPatient() {
        return codPatient;
    }

    public void setCodPatient(String codPatient) {
        this.codPatient = codPatient;
    }

    public ArrayList<Vaccine> getVaccinesPatient() {
        return vaccinesPatient;
    }

    public void setVaccinesPatient(Vaccine vaccine) {
        this.vaccinesPatient.add(vaccine);
    }

    public boolean majorityAge() {
        return getAge() >= 18;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "codPatient='" + codPatient + '\'' +
                ", vaccinesPatient{" + vaccinesPatient.toString() +
                "}} " + super.toString();
    }
}
