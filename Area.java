
public class Area {
	
	private double length,breadth;

	public void setDim(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea() {
		return length*breadth;
	}


	public static void main(String[]args)
	{
		
		Area a1 = new Area();
		a1.setDim(5, 6);
		
		System.out.println("Area of rectangle is :- "+a1.getArea());
		
	}
}
