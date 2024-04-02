
public class Sphere extends Circle  {

	public Sphere(double x, double y, double x2, double y2, double r, double h) {
		super(x, y,x2, y2, r);
	
	}

	
	public double calculateVol() {
		return (4.0/3.0)*Math.PI* Math.pow(radius, 3.0);
	}
	
	public double calculateSF() {
		return 4* Math.PI* Math.pow(radius, 2);
	}
		
	
}
