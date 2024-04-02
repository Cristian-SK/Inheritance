
public class Cylinder extends Circle {
	private double height;
		
		public Cylinder(double x, double y, double x2, double y2 ,double r,double h) {
		super(x, y, x2, y2, r);
		
		height=h;
		
	}
		
		public Cylinder(double x, double y, double x2, double y2, double r) {
			super(x, y, x2, y2, r);
			// TODO Auto-generated constructor stub
		}

		public double calculateVolume() {
			return Math.PI*Math.pow(radius,2)*height;
		}
		
		public double calculateSurfaceArea() {
			return  2 * Math.PI * radius * (radius + height);
		}
	
	}
