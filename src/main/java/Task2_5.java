import java.util.Scanner;
public class Task2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Введите число: ");
        String a = scan.nextLine();
        char[] reverseArray1 = a.toCharArray();
        System.out.println("Оригинальное число: " + a);
        System.out.print("Число в обратном порядке: ");
        for (int i = reverseArray1.length-1; i >= 0; i--) System.out.print(reverseArray1[i]);
    }
}

