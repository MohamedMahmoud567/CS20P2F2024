import com.phidget22.*;

public class BlinkLED {
    // Handle Exceptions
    public static void main(String[] args) throws Exception {
        // Create 
        DigitalOutput redLED = new DigitalOutput();
        
        // Address
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        // Open 
        redLED.open(1000);

        for (int i = 0; i < 3; i++) {
          
        	redLED.setState(true); // Turn the LED on
            Thread.sleep(2000);    // Wait for 2 seconds
            redLED.setState(false); // Turn the LED off
            Thread.sleep(1000);    // Wait for 1 second
        }

      
    }
}
