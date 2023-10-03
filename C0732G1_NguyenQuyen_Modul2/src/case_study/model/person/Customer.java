package case_study.model.person;

public class Customer extends AbstractPerson {
    private String level;
    private String Location;

    public Customer(String id, String name, String age, String gender, String identificationCard, String phoneNumber, String email, String level, String location) {
        super(id, name, age, gender, identificationCard, phoneNumber, email);
        this.level = level;
        Location = location;
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

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                " level='" + level + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
