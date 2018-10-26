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
    public double classAverage() {
        for (Student cur : students) {
            for (int i = 0; i <= students.length; i++) {
                double sum = 0;
                sum = sum + Student.getGPA();
            }
            return sum/students.length;
        }
    }
    public String printClass() {
        for (Student )
    }
}
