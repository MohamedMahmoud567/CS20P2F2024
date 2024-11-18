package skillbuilders;

public class Reverse {

    public static void main(String[] args) {
    
        int[] numbers = new int[10];

     
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

      
        System.out.println("Countdown");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
