 package Methods;
//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle 
        redLED.setDutyCycle(0.8);
        Thread.sleep(1000);
        redLED.setDutyCycle(0.9);
    }
}
  