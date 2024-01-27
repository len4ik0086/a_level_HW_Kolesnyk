package ua.kolesnyk.hw7;
//а) конструктор с параметрами в виде списка координат x, y, z
//б) метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
//в) метод, вычисляющий векторное произведение с другим вектором
//г) метод, вычисляющий косинус угла между векторами: косинус угла между векторами
//равен скалярному произведению векторов, деленному на произведение модулей (длин)
//векторов;
//д) методы для суммы и разности векторов
//е) статический метод, который принимает целое число N, и возвращает массив случайных
//векторов размером N.
//*Если метод возвращает вектор, то он должен возвращать новый объект, а не менять
//базовый

import java.util.Random;
import java.util.Scanner;

public class Vector {
    private double x;
    private double y;
    private double z;

    //а) конструктор с параметрами в виде списка координат x, y, z
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //б) метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    //в) метод, вычисляющий векторное произведение с другим вектором
    public Vector calculateCrossProduct(Vector other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Vector(newX, newY, newZ);
    }

    //г) метод, вычисляющий косинус угла между векторами: косинус угла между векторами
    //равен скалярному произведению векторов, деленному на произведение модулей (длин)
    //векторов;
    public double calculateCosineAngle(Vector other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = calculateLength() * other.calculateLength();
        return dotProduct / lengthProduct;
    }

    //д) метод для суммы векторов
    public Vector add(Vector other) {
        return new Vector(x + other.x, y + other.y, z + other.z);
    }

    //д) метод для разности векторов
    public Vector subtract(Vector other) {
        return new Vector(x - other.x, y - other.y, z - other.z);
    }

    //е) статический метод, который принимает целое число N, и возвращает массив случайных
    //векторов размером N.
    public static Vector[] createRandomVectors(int N) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate for vector A: ");
        double xA = scanner.nextDouble();
        System.out.print("Enter the y-coordinate for vector A: ");
        double yA = scanner.nextDouble();
        System.out.print("Enter the z-coordinate for vector A: ");
        double zA = scanner.nextDouble();

        System.out.print("Enter the x-coordinate for vector B: ");
        double xB = scanner.nextDouble();
        System.out.print("Enter the y-coordinate for vector B: ");
        double yB = scanner.nextDouble();
        System.out.print("Enter the z-coordinate for vector B: ");
        double zB = scanner.nextDouble();
        Vector vectorA = new Vector(xA, yA, zA);
        Vector vectorB = new Vector(xB, yB, zB);

        System.out.println("Vector A: (" + vectorA.x + ", " + vectorA.y + ", " + vectorA.z + ")");
        System.out.println("Vector B: (" + vectorB.x + ", " + vectorB.y + ", " + vectorB.z + ")");
        System.out.println("Length of vector A: " + vectorA.calculateLength());
        System.out.println("Cross product of A and B: " + vectorA.calculateCrossProduct(vectorB));
        System.out.println("Cosine angle between A and B: " + vectorA.calculateCosineAngle(vectorB));
        System.out.println("Sum of A and B: (" + vectorA.add(vectorB).x + ", " + vectorA.add(vectorB).y + ", " + vectorA.add(vectorB).z + ")");
        System.out.println("Difference of A and B: (" + vectorA.subtract(vectorB).x + ", " + vectorA.subtract(vectorB).y + ", " + vectorA.subtract(vectorB).z + ")");

        int N = 5;
        Vector[] randomVectors = Vector.createRandomVectors(N);
        for (int i = 0; i < N; i++) {
            System.out.println("Random vector " + (i + 1) + ": (" + randomVectors[i].x + ", " + randomVectors[i].y + ", " + randomVectors[i].z + ")");
        }
    }
}
