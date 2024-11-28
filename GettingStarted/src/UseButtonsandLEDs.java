import com.phidget22.*;

public class UseButtonsandLEDs {
    // Handle Exceptions 
    public static void main(String[] args) throws Exception {

        // Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        // Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Open
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // Use your Phidgets 
        while (true) {

           
            if (greenButton.getState()) {
                redLED.setState(false); // Turn off red LED when green button is pressed
            } else {
                redLED.setState(true); // Turn on red LED when green button is released
            }

           
            if (redButton.getState()) {
                greenLED.setState(false); // Turn off green LED when red button is pressed
            } else {
                greenLED.setState(true); // Turn on green LED when red button is released
            }

           
            Thread.sleep(150);
        }
    }
}
