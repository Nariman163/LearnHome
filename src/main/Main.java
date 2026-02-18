package main;  // другой пакет

import phone.Phone;  // импортируем Phone из другого пакета!
// phone.phoneMain импортировать не нужно, мы его запускаем отдельно

public class Main {
    public static void main(String[] args) {
        System.out.println("Это главный Main файл");
        System.out.println("Здесь можно работать с классами из других пакетов:");

        // Используем класс Phone из пакета phone
        Phone testPhone = new Phone("Nokia", 80);
        testPhone.printInfo();

        // phoneMain мы не импортировали, потому что это отдельная точка входа
    }
}