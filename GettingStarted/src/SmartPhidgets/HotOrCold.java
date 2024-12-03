package SmartPhidgets;

import com.phidget22.*;

public class HotOrCold {

    public static void main(String[] args) throws Exception {
        // Create and open devices
        TemperatureSensor tempSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        // Set the address for the LEDs
        greenLED.setHubPort(5);
        greenLED.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        // Open devices
        tempSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        while (true) {
           
            double currentTempCelsius = tempSensor.getTemperature();
            int currentTemp = (int) Math.round(currentTempCelsius);
            
           
            double currentTempFahrenheit = (currentTempCelsius * 9/5) + 32;
            
          
            System.out.println("Current Temperature: " + currentTemp + "°C (" + Math.round(currentTempFahrenheit) + "°F)");

         
            if (currentTemp >= 21 && currentTemp <= 24) {
                greenLED.setState(true); 
                redLED.setState(false);   
            } else {
                greenLED.setState(false); 
                redLED.setState(true);    
            }

       
            Thread.sleep(1000);  
        }
    }
}


