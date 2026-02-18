package rectangle;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Создаем прямоугольник ===\n");
        // Создаём первый прямоугольник размером 5×3
        // Переменная rect1 будет хранить ссылку на этот объект
        Rectangle rect1 = new Rectangle(5, 3);
        System.out.println("Создан прямоугольник 5×3");

        Rectangle rect2 = new Rectangle(7, 2);
        System.out.println("Создан прямоугольник 7×2");

        //Получаем периметр первого прямоугольник
        double p1 = rect1.getPerimeter();
        System.out.println("Периметр первого прямоугольника: " + p1);

        double a2 = rect2.getArea();
        System.out.println("Площадь второго прямоугольника: " + a2);
    }
}
