package phone;

public class Phone {
    // Создаем класс с полями(СВОЙСТВА)
    private String model;
    private int batteryLevel;

    //Пишем конструктор
    public Phone(String model, int batteryLevel){
        this.model = model;
        //Проверяем, чтобы заряд был в пределах 1=100
        if (batteryLevel < 0) {
            this.batteryLevel = 0;
        } else if(batteryLevel > 100){
            this.batteryLevel = 100;
        } else {
            this.batteryLevel = level;
        }

    }
    //Геттеры и сеттеры
    public String getModel(){
        return this.model;
    }
    public int getBatteryLevel(){
        return this.batteryLevel;
    }
    public void setBatteryLevel(int level){
        if (level < 0) {
            this.batteryLevel = 0;
        } else if (level > 100) {
            this.batteryLevel = 100;
        } else {
            this.batteryLevel = level;
        }

    }
    //Метод зарядки
    public void charge(int minutes){
        
    }

}
