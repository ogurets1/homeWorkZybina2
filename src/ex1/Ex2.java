package ex1;

public class Ex2 {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Функция для проверки, является ли число простым
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
