package src.entities;

public class Person {
    private String name;
    private String lastname;
    private String typeDoc;
    private String nDoc;
    private int age;


    public Person() { }
    public Person (String name, String lastname,int age,  String typeDoc, String nDoc) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.typeDoc = typeDoc;
        this.nDoc = nDoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getnDoc() {
        return nDoc;
    }

    public void setnDoc(String nDoc) {
        this.nDoc = nDoc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", typeDoc='" + typeDoc + '\'' +
                ", nDoc='" + nDoc + '\'' +
                ", age=" + age +
                '}';
    }
}
