package ua.kolesnyk.hw14;

//2. Напишите приложение, которое в 2 потока будет считать количество
//простых чисел, которые заданы в массиве, выводить результат и возвращать
//его в главный поток.
//Главный поток подсчитывает и выводит общее количество.

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        fillArray(numbers);
        System.out.println("Original array: " + Arrays.toString(numbers));

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        AtomicInteger primeCounter = new AtomicInteger(0);

        for (int i = 0; i < 2; i++) {
            int startIndex = i * numbers.length / 2;
            int endIndex = (i + 1) * numbers.length / 2;
            executorService.execute(new PrimeCounter(numbers, startIndex, endIndex, primeCounter));
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total prime number quantity is " + primeCounter.get() + ".");
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100_000);
        }
        return array;
    }

    static class PrimeCounter implements Runnable {
        private int[] numbers;
        private int startIndex;
        private int endIndex;
        private AtomicInteger primeCounter;

        public PrimeCounter(int[] numbers, int startIndex, int endIndex, AtomicInteger primeCounter) {
            this.numbers = numbers;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.primeCounter = primeCounter;
        }

        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                if (isPrime(numbers[i])) {
                    primeCounter.incrementAndGet();
                }
            }
        }

        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

}
