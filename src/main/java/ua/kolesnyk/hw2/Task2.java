package ua.kolesnyk.hw2;

public class Task2 {
    public static void main(String[] args) {
        double  x1 = 1.0,
                x2 = 3.0,
                x3 = 6.0;
        double  y1 = 5.0,
                y2 = 5.0,
                y3 = 7.0;
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площа= " + square);
        }
    }
}