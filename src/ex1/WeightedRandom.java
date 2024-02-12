package ex1;

import java.util.Random;
import java.util.Vector;

public class WeightedRandom extends Vector {
    private int[] values;
    private int[] weights;
    private Random random;

    public WeightedRandom(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        this.random = new Random();
    }

    public int getRandomValue() {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }

        int randomWeight = random.nextInt(totalWeight);
        int cumulativeWeight = 0;
        for (int i = 0; i < values.length; i++) {
            cumulativeWeight += weights[i];
            if (randomWeight < cumulativeWeight) {
                return values[i];
            }
        }

        // Если что-то пошло не так, возвращаем -1 или другое значение по умолчанию
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {1, 5, 3};
        int[] weights = {1, 2, 10};

        WeightedRandom weightedRandom = new WeightedRandom(values, weights);
        int randomValue = weightedRandom.getRandomValue();
        System.out.println(randomValue);
    }
}
