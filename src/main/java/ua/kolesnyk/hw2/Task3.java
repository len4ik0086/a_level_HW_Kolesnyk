package ua.kolesnyk.hw2;

import java.util.Scanner;
public class Task3 {
  public static void main(String args[]) {
            int num;
            System.out.println("Введите число: ");

            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if ( num % 2 == 0 )
                System.out.println("Число четное");
            else
                System.out.println("Число нечетное");
        }
    }
