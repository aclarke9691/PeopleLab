public class Classroom {
    private Student[] students;
    private Teacher teacher;
    public Classroom(String Student[], String Teacher) {
        this.students = students;
        this.teacher = teacher;
    }
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String getSubject() {
        return teacher.getSubject();
    }
    Student[] student = {}
    public double classAverage() {

    }
}
