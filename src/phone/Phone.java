package phone;

public class Phone {
    private String model;
    private int batteryLevel;

    public Phone(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int level) {
        this.batteryLevel = Math.max(0, Math.min(100, level));
    }

    public void charge(int minutes) {
        batteryLevel += minutes;
        batteryLevel = Math.min(100, batteryLevel);
        System.out.println("Телефон " + model + " заряжен до " + batteryLevel + "%");
    }

    public void use(int minutes) {
        batteryLevel -= minutes;
        batteryLevel = Math.max(0, batteryLevel);
        System.out.println("Использование " + minutes + " минут. Осталось заряда: " + batteryLevel + "%");
    }

    public void printInfo() {
        System.out.println("Модель: " + model + ", заряд: " + batteryLevel + "%");
    }
}