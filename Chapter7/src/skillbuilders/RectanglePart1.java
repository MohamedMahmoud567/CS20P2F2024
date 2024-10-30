package skillbuilders;

public class RectanglePart1 {

  
    private double length, width;

  
    public RectanglePart1() {
        length = 1;
        width = 1;		
    }

  
    public RectanglePart1(double l, double w) {
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

 
    }


