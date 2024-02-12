package ex1.exercise31;

import java.util.concurrent.TimeUnit;

public class Ex11 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < TimeUnit.SECONDS.toMillis(2)) {
            // Делаем что-то
            System.out.println("Выполняется проверка...");
        }
        System.out.println("Условие выполнено, завершение программы.");
    }
}
