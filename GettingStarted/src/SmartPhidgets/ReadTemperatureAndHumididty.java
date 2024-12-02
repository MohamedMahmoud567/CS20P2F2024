package SmartPhidgets;

import com.phidget22.*;

public class ReadTemperatureAndHumididty {
    public static void main(String[] args) throws Exception {
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        while (true) {
            System.out.println("Humidity: " + humiditySensor.getHumidity() + " %RH, Temperature: " + temperatureSensor.getTemperature() + " °C");
            Thread.sleep(150);
        }
    }
}
