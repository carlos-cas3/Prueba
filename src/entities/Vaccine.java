package src.entities;

public class Vaccine {
    private String name;
    private String kit;
    private String lot;

    public Vaccine() { }
    public Vaccine(String name, String kit, String lot) {
        this.name = name;
        this.kit = kit;
        this.lot = lot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    @Override
    public String toString() {
        return "Vaccine {" +
                "name='" + name + '\'' +
                ", kit='" + kit + '\'' +
                ", lot='" + lot + '\'' +
                '}';
    }
}
