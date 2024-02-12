package ex1;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Заполнение массива случайными числами
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100); // Генерация числа в диапазоне от 0 до 100
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Нахождение максимального значения
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        // Нахождение минимального значения
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        // Нахождение среднего значения
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        bubbleSort(array);
        System.out.println("\nArray bubbleSort sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Вывод результатов
        System.out.println();
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // меняем элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}