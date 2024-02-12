package ex1.vector;

public class ranVector {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        double length = v1.length();
        double dotProduct = v1.dotProduct(v2);
        Vector crossProduct = v1.crossProduct(v2);
        double angle = v1.angleBetween(v2);
        Vector sum = v1.add(v2);
        Vector difference = v1.subtract(v2);

        System.out.println("Length: " + length);
        System.out.println("Dot product: " + dotProduct);
        System.out.println("Cross product: " + crossProduct.x + ", " + crossProduct.y + ", " + crossProduct.z);
        System.out.println("Angle: " + angle);
        System.out.println("Sum: " + sum.x + ", " + sum.y + ", " + sum.z);
        System.out.println("Difference: " + difference.x + ", " + difference.y + ", " + difference.z);

        Vector[] randomVectors = Vector.generateRandomVectors(5);
        for (Vector vector : randomVectors) {
            System.out.println("Random vector: " + vector.x + ", " + vector.y + ", " + vector.z);
        }
    }
}
