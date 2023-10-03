package mvc_lamthem.model;

public class Student extends Person {
    private String classStudent;
    private int point;

    public Student(String id, String name, String birthDay, String phoneNumber, String email, String address, String classStudent, int point) {
        super(id, name, birthDay, phoneNumber, email, address);
        this.classStudent = classStudent;
        this.point = point;
    }
    public Student(){}

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
