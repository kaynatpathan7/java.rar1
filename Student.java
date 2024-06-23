public class Student {
    private String name;
    
    public Student() {
        this.name = "Unknown";
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student 1: " + student1.getName());
        Student student2 = new Student("Navin");
        System.out.println("Student 2: " + student2.getName());
    }
}
