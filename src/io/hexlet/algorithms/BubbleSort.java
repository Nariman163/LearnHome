package io.hexlet.algorithms;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSortLearn(int[] items) {
        var stepsCount = items.length - 1;
        boolean swapped;
        do {
          swapped =false;
          for (var i = 0; i < stepsCount; i++) {
              if (items[i] > items[i + 1]) {
                  var temp = items[i];
                  items[i] = items[i + 1];
                  items[i + 1] = temp;
                  swapped = true;
              }
          }
          stepsCount--;
        } while (swapped);
    }
    public static void main(String[] args) {
        // Создаём несколько массивов для тестирования
        int[] numbers1 = {3, 2, 10, -2, 0};
        int[] numbers2 = {5, 1, 4, 2, 8};
        int[] numbers3 = {1, 2, 3, 4, 5};


        bubbleSortLearn(numbers1);
        System.out.println("Отсортированный numbers1: " + java.util.Arrays.toString(numbers1));

        bubbleSortLearn(numbers2);
        System.out.println("Отсортированный numbers2: " + Arrays.toString(numbers2)); // Импортировал класс Array

        bubbleSortLearn(numbers3);
        System.out.println("Отсортированный numbers3: " + java.util.Arrays.toString(numbers3));
    }
}

