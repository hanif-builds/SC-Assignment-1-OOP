package task3;

public class DeviceDemo {
    public static void main(String[] args) {
        SmartBulb bulb = new SmartBulb();
        bulb.turnOn();
        bulb.setBrightness(70);
        System.out.println(bulb.getStatus());

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.turnOn();
        thermostat.setTemperature(19.5);
        System.out.println(thermostat.getStatus());
    }
}