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
    public void double classAverage() {
        for (Student cur : students) {
                double sum = 0;
                sum = sum + cur.getGPA();
                double average = sum/students.length;
        }
    }
    public String printClass() {
        for (Student )
    }
}
