
public class PerimeterFinder {
	double perimeter;
	void findPerimeter(int side) {
		perimeter=4*side;
		System.out.println("The perimeter of a square is:"+perimeter);
	}
	
	void findPerimeter(int l,int b) {
		perimeter=2*(l+b);
		System.out.println("The perimeter of a rectangle is:"+perimeter);
	}
	
	void findPerimeter(float r) {
		perimeter=2*Math.PI*r;
		System.out.println("The perimeter of a circle is:"+perimeter);
	}
}
