package Thermostat;

import com.phidget22.*;

public class BuildAThermostat {

    public static void main(String[] args) throws Exception {

        TemperatureSensor tempSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalInput redButton = new DigitalInput();



        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        greenLED.open(1000);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        redLED.open(1000);

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenButton.open(1000);

        redButton.setHubPort(2);
        redButton.setIsHubPortDevice(true);
        redButton.open(1000);
        
        tempSensor.open(1000);
        
        int setTemperature = 21;
        int maxTemperature = 30;
        int minTemperature = 15;

        while (true) {
            double currentTemperature = tempSensor.getTemperature();

            if (greenButton.getState()) {
                if (setTemperature < maxTemperature) {
                    setTemperature++;
                    System.out.println("Set Temperature increased to: " + setTemperature + "˚C");
                } else {
                    System.out.println("Maximum temperature reached: " + setTemperature + "˚C");
                }

                while (greenButton.getState()) {
                    Thread.sleep(10);
                }

                Thread.sleep(500);
            }

            if (redButton.getState()) {
                if (setTemperature > minTemperature) {
                    setTemperature--;
                    System.out.println("Set Temperature decreased to: " + setTemperature + "˚C");
                } else {
                    System.out.println("Minimum temperature reached: " + setTemperature + "˚C");
                }

                while (redButton.getState()) {
                    Thread.sleep(10);
                }

                Thread.sleep(500);
            }

            Thread.sleep(10000);
            System.out.println("Current Temperature: " + currentTemperature + "˚C");
            System.out.println("Set Temperature: " + setTemperature + "˚C");

            if (currentTemperature >= setTemperature - 2 && currentTemperature <= setTemperature + 2) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                greenLED.setState(false);
                redLED.setState(true);
            }

            Thread.sleep(50);
        }
    }
}
