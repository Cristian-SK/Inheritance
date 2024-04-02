
//
// Your documentation goes here
//

// Class that represents a point 

public class Point 
{
	// Data declaration section
	
	protected double x_coordinate;
	protected double y_coordinate;
	
	// Method declaration Section
	
	// Constructor
	
	public Point(double x, double y)
	{
		x_coordinate = x;
		y_coordinate = y;
	}

	
	public double getXCoordinate()
	{
		return x_coordinate;
		
	}
	
	public double getYCoordinate()
	{
		return y_coordinate;
		
	}
	
	public double setXCoordinate(double x)
	{
		return x_coordinate;
		
	}
	
	public double setYCoordinate(double y)
	{
		return y_coordinate;
		
	}
	
	// Method named area that returns zero
	
	public double area()
	{
		 return 0;
	}

	//***************************************************************************
	// Method that returns the distance between two points
	// **************************************************************************
	// Note: Reminder: Each point is represented by a two coordinate value (x,y) 
	//***************************************************************************
	
	public double distance(double x_2, double y_2){   
		
		 return Math.sqrt(Math.pow((x_2 - x_coordinate),2) + Math.pow( (y_2 - y_coordinate) ,2));

	}

	      
	
	
	
}



