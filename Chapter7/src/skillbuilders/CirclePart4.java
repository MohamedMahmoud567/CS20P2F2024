	package skillbuilders;

	public class CirclePart4 {

	    private double radius;
	    private static final double PI = 3.14;
	    
	    public CirclePart4() {
	        this.radius = 1;
	    }

	    
	    public CirclePart4(double r) {
	        this.radius = r;
	    }

	    public void setRadius(double r) {
	        this.radius = r;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public double area() {
	        return PI * radius * radius;
	    }

	    public double circumference() {
	        return 2 * PI * radius;
	    }

	
	    public boolean equals(Object obj) {
	        if (this == obj) return true; 
	        if (obj == null || getClass() != obj.getClass()) return false; 
	        CirclePartOne other = (CirclePartOne) obj;
	        return Double.compare(other.radius, radius) == 0; 
	    }

	    @Override
	    public String toString() {
	        return "Circle has radius " + radius;
	    }
	}
