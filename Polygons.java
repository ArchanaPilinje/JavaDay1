import java.util.*;
public class Polygons {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int flag = 0;
		do {
			System.out.println("Please choose from the following options:");
			System.out.println("1.Find Area\n2.Find Perimeter\n3.Find Volume");
			int ch1 = sc.nextInt();
			switch (ch1) {
			case 1:
				AreaFinder a = new AreaFinder();
				System.out.println("Please again choose from the following options:");
				System.out.println("1.Square\n2.Rectangle\n3.Circle\n");
				int ch2 = sc.nextInt();
				switch (ch2) {
				case 1:
					System.out.println("Enter the side of the square");
					int side = sc.nextInt();
					a.findArea(side);
					break;

				case 2:
					System.out.println("Enter the length and breadth of the rectangle");
					int l = sc.nextInt();
					int b = sc.nextInt();
					a.findArea(l, b);
					break;

				case 3:
					System.out.println("Enter the radius of the circle");
					float r = sc.nextFloat();
					a.findArea(r);
					break;
				}
				break;

			case 2:
				PerimeterFinder p = new PerimeterFinder();
				System.out.println("Please again choose from the following options:");
				System.out.println("1.Square\n2.Rectangle\n3.Circle\n");
				int ch3 = sc.nextInt();
				switch (ch3) {
				case 1:
					System.out.println("Enter the side of the square");
					int side = sc.nextInt();
					p.findPerimeter(side);
					break;

				case 2:
					System.out.println("Enter the length and breadth of the rectangle");
					int l = sc.nextInt();
					int b = sc.nextInt();
					p.findPerimeter(l, b);
					break;

				case 3:
					System.out.println("Enter the radius of the circle");
					float r = sc.nextFloat();
					p.findPerimeter(r);
					break;
				}
				break;

			case 3:
				VolumeFinder v = new VolumeFinder();
				System.out.println("Please again choose from the following options:");
				System.out.println("1.Cube\n2.Cuboid\n3.Sphere\n");
				int ch4 = sc.nextInt();
				switch (ch4) {
				case 1:
					System.out.println("Enter the side of the cube");
					int side = sc.nextInt();
					v.findVolume(side);
					break;

				case 2:
					System.out.println("Enter the length, breadth and height of the cuboid");
					int l = sc.nextInt();
					int b = sc.nextInt();
					int h = sc.nextInt();
					v.findVolume(l, b, h);
					break;

				case 3:
					System.out.println("Enter the radius of the sphere");
					float r = sc.nextFloat();
					v.findVolume(r);
					break;
				}
				break;

			}
			System.out.println("Press the Corresponding option:\n1.Continue 0. Exit");
			flag = sc.nextInt();
		} while (flag==1);
	}

}
