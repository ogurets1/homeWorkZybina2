package ex1.vector;

import java.util.Random;

public class Vector {
    protected double x;
    protected double y;
    protected double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dotProduct(Vector other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector crossProduct(Vector other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Vector(newX, newY, newZ);
    }

    public double angleBetween(Vector other) {
        double dotProduct = dotProduct(other);
        double lengthProduct = length() * other.length();
        return Math.acos(dotProduct / lengthProduct);
    }

    public Vector add(Vector other) {
        double newX = x + other.x;
        double newY = y + other.y;
        double newZ = z + other.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector subtract(Vector other) {
        double newX = x - other.x;
        double newY = y - other.y;
        double newZ = z - other.z;
        return new Vector(newX, newY, newZ);
    }

    public static Vector[] generateRandomVectors(int N) {
        Vector[] vectors = new Vector[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Vector(x, y, z);
        }
        return vectors;
    }
}
