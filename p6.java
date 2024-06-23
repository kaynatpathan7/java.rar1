class p6 {
    protected double length;
    protected double breadth;

    public p6(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    public void printPerimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + breadth)));
    }
}

class Square extends p6 {
    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {
        p6 rectangle = new p6(4, 5);
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(4);
        square.printArea();
        square.printPerimeter();
    }
}
