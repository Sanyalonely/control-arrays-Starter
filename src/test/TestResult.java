package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {
        // Тестовий масив
        int[] data = {1, 5, 2, 5, 3, 5, 2, 1, 1, 1};

        int result = Exercise.calculate(data);

        System.out.println("Вихідний масив: " + Arrays.toString(data));
        System.out.println("Найчастіше число в масиві це: " + result);
    }
}
