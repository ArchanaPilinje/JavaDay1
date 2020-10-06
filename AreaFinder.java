import java.lang.Math;
public class AreaFinder {
	double area;
	void findArea(int side) {
		area=side*side;
		System.out.println("Area of Square:"+area);
	}
	
	void findArea(int l,int b) {
		area=l*b;
		System.out.println("Area of rectangle:"+area);
	}
	
	void findArea(float r) {
		area=Math.PI*r*r;
		System.out.println("Area of circle:"+area);
	}
}
