package skillbuilders;

public class RectanglePart3 {

	public static void main(String[] args) {
		

	}
	public class Rectangle {
	    private double length, width;

	    public Rectangle() {
	        length = 1;
	        width = 1;		
	    }

	    public Rectangle(double l, double w) {
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

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Rectangle)) return false;
	        Rectangle other = (Rectangle) obj;
	        return length == other.length && width == other.width;
	    }

	    @Override
	    public String toString() {
	        return String.format("Rectangle[length=%.1f, width=%.1f]", length, width);
	    }
	}

}
