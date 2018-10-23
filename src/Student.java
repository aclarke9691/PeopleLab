public class Student extends Person {
    private double GPA;
    private int OSIS;
    private String major;
    public Student(double GPA, int OSIS, String major, String firstName, String familyName) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.OSIS = OSIS;
        this.major = major;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public int getOSIS() {
        return OSIS;
    }
    public void setOSIS(int OSIS) {
        this.OSIS = OSIS;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String toString() {
        return "My name is " + getFirstName() +  getFamilyName() + ".";
    }
}
