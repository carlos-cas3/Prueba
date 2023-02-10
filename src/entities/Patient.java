package src.entities;

public class Patient extends Person {
    private String codPatient;

    public Patient() { }
    public Patient(String name, String lastname, int age, String typeDoc, String nDoc, String codPatient) {
        super(name, lastname, age, typeDoc, nDoc);
        this.codPatient = codPatient;
    }

    public boolean majorityAge() {
        return getAge() >= 18;
    }

    public void showSpecificPatient() {

    }

    @Override
    public String toString() {
        return "Patient {" +
                "codPatient='" + codPatient + '\'' +
                "} " + super.toString();
    }
}
