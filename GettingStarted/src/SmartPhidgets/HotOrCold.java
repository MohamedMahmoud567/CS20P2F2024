package SmartPhidgets;

import com.phidget22.*;

public class HotOrCold {

    public static void main(String[] args) throws Exception {
      
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

     
        temperatureSensor.open(1000);

       
        greenLED.setHubPort(0); 
        greenLED.setIsHubPortDevice(true);
        greenLED.open(1000);
        
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        redLED.open(1000);

        while (true) {
          
            if (temperatureSensor.getTemperature() >= 20.0 && temperatureSensor.getTemperature() <= 24.0) {
                
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                // If temperature is out of range, turn on the red LED, turn off green LED
                redLED.setState(true);
                greenLED.setState(false);
            

     
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");

           
            Thread.sleep(1000); 
        }
        }
    }
}




