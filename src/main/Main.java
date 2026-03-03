package main;  // другой пакет

import io.hexlet.algorithms.BubbleSort;
import phone.Phone;  // импортируем Phone из другого пакета!

import java.util.Arrays;
// phone.phoneMain импортировать не нужно, мы его запускаем отдельно

public class Main {
    public static void main(String[] args) {
        System.out.println("Это главный Main файл");
        System.out.println("Здесь можно работать с классами из других пакетов:");

        // Используем класс Phone из пакета phone
        Phone testPhone = new Phone("Nokia", 80);
        testPhone.printInfo();

        int[] numbers1 = {3, 2, 5, 5, 8};
        BubbleSort.bubbleSortLearn(numbers1);
        System.out.println(Arrays.toString(numbers1));

    }
}