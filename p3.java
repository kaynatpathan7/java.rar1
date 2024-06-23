class p3 {
    private String name;

    // Constructor without parameters
    public p3() {
        this.name = "Unknown";
    }

    // Constructor with parameter
    public p3(String name) {
        this.name = name;
    }

    // Method to print the name
    public void printName() {
        System.out.println("Student's name: " + this.name);
    }

    public static void main(String[] args) {
        p3 student1 = new p3();
        p3 student2 = new p3("Navin");

        student1.printName();
        student2.printName();
    }
}
