import com.phidget22.*;

public class TugOfWar {
    public static void main(String[] args) throws Exception {

        // Create objects for Red and Green buttons and LEDs
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        // Set up the hub ports for the devices
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Open connections to the devices
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // Track how many times each player has pressed their button
        int redButtonPresses = 0;
        int greenButtonPresses = 0;

        // Enable alternating turns (Red starts first)
        boolean redpress = true; 
        boolean greenpress = true; 
        // Game loop
        while (true) {

            // If it's Red's turn and Red presses the button
            if (redpress && redButton.getState()) {
                redButtonPresses++; // Count Red's press
                redpress = false;    // Switch to Green's turn
                greenpress = true;   // It's now Green's turn

                // Check if Red has pressed 10 times
                if (redButtonPresses >= 10) {
                    // Flash both LEDs, then Red's LED 5 times
                    redLED.setState(true);
                    greenLED.setState(true);
                    Thread.sleep(500); // Wait for 500ms
                    redLED.setState(false);
                    greenLED.setState(false);
                    Thread.sleep(500); // Wait for 500ms

                    // Flash Red's LED 5 times to signal Red's win
                    for (int i = 0; i < 5; i++) {
                        redLED.setState(true);
                        Thread.sleep(250);
                        redLED.setState(false);
                        Thread.sleep(250);
                    }
                    break; // End game after Red wins
                }
            }

            // If it's Green's turn and Green presses the button
            if (greenpress && greenButton.getState()) {
                greenButtonPresses++; // Count Green's press
                greenpress = false;   // Switch to Red's turn
                redpress = true;      // It's now Red's turn

               
                
                // Check if Green has pressed 10 times
                if (greenButtonPresses >= 10) {
                  
                	// Flash both LEDs, then Green's LED 5 times
                    redLED.setState(true);
                    greenLED.setState(true);
                    Thread.sleep(500); // Wait for 500ms
                    greenLED.setState(false);
                    redLED.setState(false);
                    Thread.sleep(500); // Wait for 500ms

                    // Flash Green's LED 5 times to signal Green's win
                    for (int i = 0; i < 5; i++) {
                        greenLED.setState(true);
                        Thread.sleep(250);
                        greenLED.setState(false);
                        Thread.sleep(250);
                    }
                    break; // End game after Green wins
                }
            }

            // Short delay before checking button states again
            Thread.sleep(150);
        }
    }
}
