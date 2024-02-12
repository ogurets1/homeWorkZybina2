package ex1;

import java.util.Arrays;

public class ArraySearch {
    // Поиск элемента в массиве с использованием перебора
    public static boolean linearSearch(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Двоичный поиск элемента в отсортированном массиве
    public static boolean binarySearch(int[] array, int target) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // пример массива для поиска элемента

        int target = 5;

        long startTime = System.currentTimeMillis();
        boolean resultLinearSearch = linearSearch(array, target);
        long endTime = System.currentTimeMillis();
        System.out.println("Linear search result: " + resultLinearSearch);
        System.out.println("Linear search execution time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        boolean resultBinarySearch = binarySearch(array, target);
        endTime = System.currentTimeMillis();
        System.out.println("Binary search result: " + resultBinarySearch);
        System.out.println("Binary search execution time: " + (endTime - startTime) + "ms");
    }
}
