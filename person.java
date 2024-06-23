public class Person {
    private String name;
    private double income;
    private double taxRate;

    public Person(String name, double income, double taxRate) {
        this.name = name;
        this.income = income;
        this.taxRate = taxRate;
    }

    public double calculateTax() {
        return income * taxRate / 100;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Navin", 50000, 20);
        Person person2 = new Person("Raj", 75000, 25);
        System.out.println(person1.getName() + "'s Tax: " + person1.calculateTax());
        System.out.println(person2.getName() + "'s Tax: " + person2.calculateTax());
    }
}
