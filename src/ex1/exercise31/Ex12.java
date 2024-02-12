package ex1.exercise31;

import java.util.ArrayList;
import java.util.Collections;

public class Ex12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Исходный список: " + numbers);

        // Прокрутка вверх
        Collections.reverse(numbers);
        System.out.println("Прокрученный вверх список: " + numbers);

        // Прокрутка вниз
        Collections.reverse(numbers);
        System.out.println("Прокрученный вниз список: " + numbers);
    }
}
