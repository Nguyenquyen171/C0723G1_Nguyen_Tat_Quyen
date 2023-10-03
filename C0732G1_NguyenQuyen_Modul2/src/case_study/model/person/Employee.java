package case_study.model.person;

public class Employee extends AbstractPerson {
    private String guestType;
    private String address;
    private String amount;

    public Employee() {

    }

    public Employee(String id, String name, String age, String gender, String identificationCard, String phoneNumber, String email, String guestType, String address, String amount) {
        super(id, name, age, gender, identificationCard, phoneNumber, email);
        this.guestType = guestType;
        this.address = address;
        this.amount = amount;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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
                super.toString() +
                " guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
