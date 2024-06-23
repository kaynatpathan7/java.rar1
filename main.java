class Rectangle {
   
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side); 
    }

}

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.printArea();
        rectangle.printPerimeter();
        Square square = new Square(4.0);
        square.printArea();
        square.printPerimeter();
    }
}
