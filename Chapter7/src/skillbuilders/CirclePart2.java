package skillbuilders;

public class CirclePart2 {

    public static void main(String[] args) {
      
    }
    
    public static class Circle {
        private double radius;

        public Circle() {
            this.radius = 1.0; 
        }

   
        public Circle(double radius) {
            this.radius = radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double circumference() {
            return 2 * Math.PI * radius;
        }
    }
}