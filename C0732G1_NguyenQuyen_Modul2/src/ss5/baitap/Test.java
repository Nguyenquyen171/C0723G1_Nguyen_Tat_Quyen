package ss5.baitap;

public class Test {
    public static void main(String[] args) {
        Student student= new Student();
        System.out.println(student.name);
        System.out.println(student.classes);
        System.out.println();
        student.setName("Quyen Dep trai");
        student.setClasses("C0732G1");
        System.out.println(student.name);
        System.out.println(student.classes);
    }
    public static class Student{
        private String name="Join";
        private String classes="C02";
        public Student(){
        }
        public void setName(String name) {
            this.name = name;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }
    }
}
