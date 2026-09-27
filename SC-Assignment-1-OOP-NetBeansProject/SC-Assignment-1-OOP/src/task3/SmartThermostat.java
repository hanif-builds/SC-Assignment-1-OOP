package task3;

public class SmartThermostat implements SmartDevice {

    private boolean isOn = false;
    private double temperature = 22.0;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        return isOn ? "The thermostat is ON, target temp = " + temperature + "C"
                    : "The thermostat is OFF, target temp = " + temperature + "C";
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }
}
