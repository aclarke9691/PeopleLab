public class Runner {
    public static void main(String[] args) {
        Student student = new Student(3.7, 274839582, "Finance", "Ricky", "Chu");
        System.out.println(student.toString());
        Teacher teacher = new Teacher("Computer Science", "Mr", "Ricky", "Chu");
        System.out.println(teacher.toString());
    }
}
