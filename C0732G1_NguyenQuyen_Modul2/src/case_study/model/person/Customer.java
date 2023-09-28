package case_study.model.person;

public class Customer extends AbstractPerson {
    private String level;
    private String Location;
    private double wage;

    public Customer(String id, String name, String gender, String birthDay, String identificationCard, int phoneNumber, String email, String level, String location, double wage) {
        super(id, name, gender, birthDay, identificationCard, phoneNumber, email);
        this.level = level;
        Location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "level='" + getLevel() + '\'' +
                ", Location='" + getLocation() + '\'' +
                ", wage=" + getWage() +
                '}';
    }
}
