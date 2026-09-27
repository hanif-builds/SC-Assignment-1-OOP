package task3;

public class SmartBulb implements SmartDevice {

    private boolean isOn = false;
    private int brightness = 0;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        return isOn ? "The smart bulb is ON." : "The smart bulb is OFF.";
    }

    public int setBrightness(int brightness) {
        if (brightness < 0) {
            throw new IllegalArgumentException("Brightness cannot be less than zero.");
        }
        else if (brightness > 100) {
            throw new IllegalArgumentException("Brightness cannot be greater than 100.");
        }
        this.brightness = brightness;
        return this.brightness;
    }
}
