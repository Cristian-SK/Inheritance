	
	public class Circle extends Point{
		
		protected double radius;
		private double x_2;
		private double y_2;
		
		public Circle(double x, double y, double x2, double y2, double r) {
			super(2, 3);

			radius=r;
			x_2= x2;
			y_2=y2;
			
		}
		
		
		public double getRadius() {
			return radius;
		}

		public void setRadius(double r) {
			radius = r;
		}

		public double getX_2() {
			return x_2;
		}

		public void setX_2(double x2) {
			x_2 = x2;
		}

		public double getY_2() {
			return y_2;
		}

		public void setY_2(double y2) {
			y_2 = y2;
		}
		
		@Override
		public double area() {
			return Math.pow(radius,2)*Math.PI;
		}
		

	
	
		
		
		
	
	}