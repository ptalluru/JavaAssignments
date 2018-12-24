public class Rectangle {
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double area(){
		double area= length*width;
		return area;
	}
	public double perimeter(){
		double perimeter =2*(length+width);
		return perimeter;
	}
	public double lengthOfDiagonal(){
		double lengthSquare= Math.pow(length,2);
		double widthSquare= Math.pow(width, 2);
		double addSquaresOfLb=lengthSquare+widthSquare;
		double diagonalLength=Math.sqrt(addSquaresOfLb);
		return diagonalLength;
		
	}
	/*public static boolean result(rectangle area, rectangle1 area1) {
		if(area==area1)
			return true;
		else
			return false;
	}*/

	public static boolean areaCompare(Rectangle rectangle, Rectangle rectangle1) {

		if(rectangle.area()==rectangle1.area())
			return true;
		else
			return false;
	}
	
	
}
