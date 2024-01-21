package ua.kolesnyk.hw6;

public class Task2 {

    public static void main(String[] args) {
        int[][] triangle = new int[5][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle[i].length + "!");// не указано значение переменной triangle[i].length в цикле, нашла при осмотре результатов вывода в консоль, выводилось не то, что нужно
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {// было i < triangle[i].length; , а должно быть j < triangle[i].length; найдено при визуальном осмотре кода.
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}