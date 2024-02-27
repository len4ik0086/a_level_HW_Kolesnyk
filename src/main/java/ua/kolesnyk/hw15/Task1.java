package ua.kolesnyk.hw15;

//Создать экземпляр класса с приватным конструктором и изменить значение
//переменных:
//public class A {
//private String id = "123";
//private String name = "A";
//private A() {
//}
//@Override
//public String toString() {
//return "A{" +
//"id='" + id + '\'' +
//", name='" + name + '\'' +
//'}';
//}
//}

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Task1 {
    public static void main(String[] args) {
        try {
            Constructor<A> constructor = A.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            A aInstance = constructor.newInstance();

            Field idField = A.class.getDeclaredField("id");
            Field nameField = A.class.getDeclaredField("name");
            idField.setAccessible(true);
            nameField.setAccessible(true);
            idField.set(aInstance, "246");
            nameField.set(aInstance, "B");

            System.out.println(aInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
