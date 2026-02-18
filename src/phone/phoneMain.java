package phone;  // тот же пакет, что и Phone

public class phoneMain {
    public static void main(String[] args) {
        // Создаём объекты класса Phone
        Phone phone1 = new Phone("iPhone 13", 50);
        Phone phone2 = new Phone("Samsung S21", 110); // автоматически станет 100

        // Тестируем методы
        phone1.printInfo();
        phone2.printInfo();

        phone1.charge(30);
        phone2.use(40);

        phone1.setBatteryLevel(120); // станет 100
        phone1.printInfo();

        System.out.println("Модель первого телефона: " + phone1.getModel());
    }
}