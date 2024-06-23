class p10 {
    p10 get() {
        return this;
    }
}

class Derived extends p10 {
    @Override
    Derived get() {
        return this;
    }

    void display() {
        System.out.println("Derived class method");
    }

    public static void main(String[] args) {
        new Derived().get().display();
    }
}