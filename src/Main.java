
public class Main {
	public static void main(String[] args) {
		Point p= new Point(2,3);
		Circle c= new Circle(2,3,3,4,2); //x1, y1, x2, y2, r
		Cylinder S= new Cylinder(2,3,3,4,2,7); //x1, y1, x2, y2, r, h
		Sphere SF = new Sphere(2,3,3,4,2,7); //x1, y1, x2, y2, r, h
		System.out.println("Area of the circle: " +c.area());
		System.out.println("Distance of the two points: " + c.distance(3, 4));
		System.out.println("Volume: "+ S.calculateVolume());
		System.out.println("Surface Area: "+ S.calculateSurfaceArea());
		System.out.println("Volume of a Sphere: "+ SF.calculateVol());
		System.out.println("Surface area of a Sphere: "+ SF.calculateSF());
	}
}
