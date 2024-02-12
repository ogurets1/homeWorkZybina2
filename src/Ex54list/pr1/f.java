package Ex54list.pr1;

import java.util.Scanner;

public class f {

    public static int getSumNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double getAverage(int[] numbers) {
        int sum = getSumNumbers(numbers);
        return (double) sum / numbers.length;
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getProduct(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    public static int getDifference(int[] numbers) {
        int difference = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference -= numbers[i];
        }
        return difference;
    }

    public static int getMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int getMinNumber(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    //double

    public static double getSum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double getMax(double[] numbers) {
        double max = Double.MIN_VALUE;
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double getMin(double[] numbers) {
        double min = Double.MAX_VALUE;
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double getProduct(double[] numbers) {
        double product = 1;
        for (double number : numbers) {
            product *= number;
        }
        return product;
    }

    public static double getAverage(double[] numbers) {
        double sum = getSum(numbers);
        return sum / numbers.length;
    }

    public static double getDifference(double[] numbers) {
        double difference = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference -= numbers[i];
        }
        return difference;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность чисел через пробел: ");
        String input = scanner.nextLine();
        String[] numbersString = input.split(" ");
        int length = numbersString.length;
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            try {
                numbers[i] = (int) Double.parseDouble(numbersString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное значение");
                return;
            }
        }

        if (args.length == 0) {
            System.out.println("Необходимо передать последовательность чисел в качестве аргументов командной строки.");
            return;
        }

        //int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Один из аргументов командной строки не является целым числом.");
                return;
            }
        }

        // Вызов методов для вычисления функций над последовательностью чисел
        int sum = getSumNumbers(numbers);
        int max = getMaxNumber(numbers);
        int min = getMinNumber(numbers);
        int product = getProduct(numbers);
        int difference = getDifference(numbers);

        // Вывод результатов
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Произведение чисел: " + product);
        System.out.println("Разность чисел: " + difference);

    }
}
