		package skillbuilders;

	public class RectanglePart2 {

	    private double length, width;

	    public RectanglePart2() {
	        length = 1;
	        width = 1;		
	    }

	    public RectanglePart2(double l, double w) {
	        length = l;
	        width = w;
	    }

	    public void setLength(double newL) {
	        length = newL;
	    }

	    public void setWidth(double newW) {
	        width = newW;
	    }

	    public double getLength() {
	        return length;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public double area() {
	        return length * width;
	    }

	    // Class method to display the area formula
	    public static void displayAreaFormula() {
	        System.out.println("Area = length * width");
	    }
	}

