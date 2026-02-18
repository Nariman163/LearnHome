package rectangle;

public class Rectangle {
    //Свойства (поля)  Они будут храниться в памяти для каждого созданного объекта
     double length;
     double width;

    /**
    Конструктор - это специальный метод, который вызывается когда мы создаем новый прямоугольник
     через new Rectangle(...)
    Его задача - заполнить свойства начальными значениями.
     */
    public Rectangle(double length, double width){
        this.length = length; // this.length - поле, length - параметр
    //Параметр — это то, что ты передаёшь в метод (или конструктор), когда вызываешь его. Проще говоря: параметр — это входные данные, которые метод получает для работы.
        this.width = width;
    }
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }
    public double getArea(){
        return this.length * this.width;
    }
    public void printInfo(){
        System.out.println("Прямоугольник:" + length + "x" + width);
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
    }

}



