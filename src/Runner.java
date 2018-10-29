public class Runner {
    static String[] firstNames = {"Julius", "Sanjay", "Serline", "Thomas", "Sage", "Byron", "Wei", "Allen", "Ricky", "Ashanti", "Jazmine", "Yussef", "Belal", "Loris", "Harpreet", "Kiran", "Ari", "Dea", "Janice", "Samuel", "Astor", "Linyao", "Abdul", "Ishrat", "Robert", "Jason", "Bryant", "Benjamin", "Dana", "Jonathan", "Ricky"};
    static String[] familyNames = {"Ambroziak", "Bajnath", "Cai", "Cavalluzzi", "Charity Griffit", "Chen", "Chen", "Chen", "Chu", "Clarke", "Freund", "Ibarra", "Jamil", "Jautakas", "Kaur", "Khambhla", "Khaytser", "Kurti", "Lin", "Mei", "Meredith Goujon", "Pan", "Rafi", "Soha", "Straight", "Tan", "Tsang", "Wu", "Zargarova", "Zhao", "Zhao"};
    static String[] majors = {"Aerospace", "Architecture", "Biological Sciences", "Chemistry", "Civil Engineering", "Electrical Engineering", "Environmental Science", "Finance", "Industrial Design", "Law & Society", "LIU Advanced Health Professions", "LIU PharmD", "Mathematics", "Mechatronics & Robotics", "Media", "Physics", "Social Science Research", "Software Engineering"};

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Computer Science", "Mr", "Nathan", "Levin");
        Student[] students = new Student[31];
        for (int i = 0; i < students.length; i++) {
            students[i] = randomStudent();
        }
        Classroom classroom = new Classroom(students, teacher);
        classroom.printClass();
        System.out.println("The teacher is Mr.Levin and he teaches Computer Science.");
        System.out.println("The class's average GPA is " + classroom.classAverage() + ".");
    }
    public static Student randomStudent() {
        Student student = new Student(randomFirstName(), randomFamilyName(), (Math.random() * 101.00) + 0.00, (Math.random() * 100000000) + 200000000, randomMajor());
        return student;
    }
    public static String randomFirstName() {
        return firstNames[(int) (Math.random() * firstNames.length)];
    }
    public static String randomFamilyName() {
        return familyNames[(int) (Math.random() * familyNames.length)];
    }
    public static String randomMajor() {
        return majors[(int) (Math.random() * majors.length)];
    }
}
