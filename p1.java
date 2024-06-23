class p1 {
    private double length;
    private double breadth;

    // Method to set the dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        p1 rect = new p1();
        rect.setDim(5, 10);
        System.out.println("The area of the rectangle is: " + rect.getArea());
    }
}