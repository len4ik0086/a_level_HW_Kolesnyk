package ua.kolesnyk.hw9;

// Создайте класс с двумя методами f( ) и g( ). В g( ) выбросите исключение
//В f( ) вызовите g( ), поймайте его исключение и, в блоке catch, выбросите
//другое исключение
// Проверьте ваш код в main( ).
public class Task2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (CustomException e) {
            System.out.println("Обработка другого исключения в main(): " + e.getMessage());
        }
    }

    static void f() throws CustomException {
        try {
            g();
        } catch (OriginalException e) {
            throw new CustomException("Новое исключение в методе f()");
        }
    }

    static void g() throws OriginalException {
        throw new OriginalException("Оригинальное исключение в методе g()");
    }
}

class OriginalException extends Exception {
    public OriginalException(String message) {
        super(message);
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}



