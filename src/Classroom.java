public class Classroom {
    private Student[] students;
    private Teacher teacher;
    public Classroom(Student[] students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }
    public String getSubject() {
        return teacher.getSubject();
    }
    public double classAverage() {
        double sum = 0;
        for (Student cur : students) {
                sum = sum + cur.getGPA();
        }
        double average = sum/students.length;
        return average;
    }
    public void printClass() {
        System.out.println(teacher.toString());
        System.out.println(teacher.getSubject());
        for (Student cur: students) {
            System.out.println(cur.toString() + "\n" + "The student's GPA is " + cur.getGPA() + "." + "\n" + "The student's OSIS is " + cur.getOSIS() + "." + "\n" + "Major: " + cur.getMajor());
        }
    }
}
