public class Teacher extends Person {
    private String subject;
    private String Title;
    private String familyName;
    public Teacher(String subject, String Title, String familyName) {
        super(subject, Title);
        this.subject = subject;
        this.Title = Title;
        this.familyName = familyName;
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
        return "My name is " + Title + "." + familyName + ".";
    }
}
