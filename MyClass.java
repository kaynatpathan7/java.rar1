// Try to add default constructor in the program

public class MyClass {
    int value;
    public MyClass() {
        value = 0;
        System.out.println("Default constructor" + value);
    }

    public MyClass(int value) {
        this.value = value;
        System.out.println("Parameterized constructor" + value);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(100);   
    }
}
