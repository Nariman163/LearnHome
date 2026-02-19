package io.hexlet;

public class App {
    // Статический метод, который возвращает строку с информацией о фигуре
    public static String getFigureSquare(Geometric figure) {
        return "Square of " + figure.getName() + " is " + figure.getSquare();
    }

    // Метод main для тестирования
    public static void main(String[] args) {
        Geometric quadrate = new Quadrate(5);
        System.out.println(getFigureSquare(quadrate)); // Вызов статического метода
    }
}