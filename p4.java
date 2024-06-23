public class p4 {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 3, 4, 5);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }

    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle {
        private double length;
        private double breadth;

        public Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public double getArea() {
            return length * breadth;
        }

        public double getPerimeter() {
            return 2 * (length + breadth);
        }
    }

    static class Triangle {
        private double base;
        private double height;
        private double sideA;
        private double sideB;
        private double sideC;

        public Triangle(double base, double height, double sideA, double sideB, double sideC) {
            this.base = base;
            this.height = height;
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public double getArea() {
            return 0.5 * base * height;
        }

        public double getPerimeter() {
            return sideA + sideB + sideC;
        }
    }
}
