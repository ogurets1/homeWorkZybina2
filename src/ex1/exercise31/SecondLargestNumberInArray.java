package ex1.exercise31;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {

        int[] numbers = {10, 35, 20, 15, 30}; // Пример массива чисел (можно изменить)
        int secondLargest = findSecondLargest(numbers);

        System.out.println("Второе по величине число в массиве: " + secondLargest);
    }

    public static int findSecondLargest(int[] numbers) {
        Arrays.sort(numbers);

        int n = numbers.length;
        int i = n - 2;
        while (i >= 0 && numbers[i] == numbers[n - 1]) {
            i--;
        }

        return (i >= 0) ? numbers[i] : -1; // Возвращает -1, если не удалось найти второе по величине число
    }
}
