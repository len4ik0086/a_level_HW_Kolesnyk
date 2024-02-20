package ua.kolesnyk.hw14;

//1. Напишите приложение, которое создает 50 потоков один за одним,
//каждый из потоков выводит сообщение
//"Hello from thread (number of thread)", особенность заключается в том, что
//вывод должен быть строго в обратном порядке, от 49 до 0

public class Task1 {
    public static void main(String[] args) {
        for (int i = 49; i >= 0; i--) {
            Thread thread = new Thread(new Worker(i));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker implements Runnable {
        private final int threadNumber;

        public Worker(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            System.out.println("Hello from thread " + threadNumber);
        }
    }
}
