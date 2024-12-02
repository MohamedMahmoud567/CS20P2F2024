package SmartPhidgets;

import com.phidget22.*;

public class ReadTemperature {
    public static void main(String[] args) throws Exception {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.open(1000);

        while (true) {
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
            Thread.sleep(150);
        }
    }
}
