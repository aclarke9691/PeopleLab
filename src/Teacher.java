public class Teacher extends Person {
    private String subject;
    private String Title;
    public Teacher(String subject, String Title, String firstName, String familyName) {
        super(firstName, familyName);
        this.subject = subject;
        this.Title = Title;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String toString() {
        return "My name is " + Title + "." + getFamilyName() + ".";
    }
}
