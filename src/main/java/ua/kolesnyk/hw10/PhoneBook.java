package ua.kolesnyk.hw10;

import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите телефонный номер: ");
        String phoneNumber = scanner.nextLine();

        Optional<Integer> index = findIndexByPhoneNumber(phoneNumber);

        if (index.isPresent()) {
            System.out.println("Телефонный номер пренадлежит абоненту: " + index.get());
        } else {
            System.out.println("Телефонный номер не найден в телефонной книге");
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (Objects.equals(PHONE_BOOK[i], phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

}