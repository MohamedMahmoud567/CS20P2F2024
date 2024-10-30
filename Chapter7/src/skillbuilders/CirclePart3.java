package skillbuilders;

		public class CirclePart3 {

		    private double radius;
		    private static double PI = 3.14;

		
		    public CirclePart3() {
		        radius = 1;
		    }

		  
		    public CirclePart3(double r) {
		        radius = r;	
		    }

		    public void setRadius(double r) {
		        radius = r;
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

		    public boolean equals(Object c) {
		        if (c instanceof CirclePartOne) {
		            CirclePartOne testObj = (CirclePartOne) c;
		            return testObj.getRadius() == radius;
		        }
		        return false;
		    }

		    public String toString() {
		        return "Circle has radius " + radius;
		    }


		    public static void displayAreaFormula() {
		        System.out.println("Area = π * radius^2");
		    }
		}


