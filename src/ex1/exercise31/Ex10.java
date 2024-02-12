package ex1.exercise31;

import java.util.ArrayList;

public class Ex10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Использование цикла for
        System.out.println("Использование цикла for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Использование цикла while
        System.out.println("\nИспользование цикла while:");
        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }

        // Использование улучшенного цикла for
        System.out.println("\nИспользование улучшенного цикла for:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
