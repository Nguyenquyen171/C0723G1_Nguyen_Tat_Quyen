package case_study.model.person;

public class Employee extends AbstractPerson {
    private String guestType;
    private String address;

    public Employee(String id, String name, String gender, String birthDay, String identificationCard, int phoneNumber, String email, String guestType, String address) {
        super(id, name, gender, birthDay, identificationCard, phoneNumber, email);
        this.guestType = guestType;
        this.address = address;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
