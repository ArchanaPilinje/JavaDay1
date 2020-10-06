
public class VolumeFinder {
	double volume;
	void findVolume(int side) {
		volume=side*side*side;
		System.out.println("The volume of a cube is: "+volume);
	}
	
	void findVolume(int l,int b,int h) {
		volume=l*b*h;
		System.out.println("The volume of a cuboid is: "+volume);
	}
	
	void findVolume(float r) {
		double t=4.0/3.0;
		//System.out.println(t);
		volume=(t)*Math.PI*r*r*r;
		System.out.println("The volume of a sphere is: "+volume);
	}
}
