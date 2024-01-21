package ua.kolesnyk.hw6;

//Класс Phone.
//а) Создайте класс Phone, который содержит переменные(поля) number,
//model и weight.
//б) Добавить конструктор в класс Phone, который принимает на вход
//три параметра для инициализации переменных класса - number, model
//и weight.
//в) Добавить конструктор, который принимает на вход два параметра
//для инициализации переменных класса - number, model.
//г) Добавить конструктор без параметров.
//д) Создайте три экземпляра этого класса.
//ж) Присвоить значения полям класса.
//з) Выведите на консоль значения их полей.
//и) Добавить в класс Phone методы: receiveCall, имеет один параметр
//– имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
//getNumber – возвращает номер телефона. Вызвать эти методы для
//каждого из объектов.

public class Phone {
    //а) Создайте класс Phone, который содержит переменные(поля) number,
    //model и weight.
    String number;
    String model;
    double weight;

    //б) Добавить конструктор в класс Phone, который принимает на вход
    //три параметра для инициализации переменных класса - number, model
    //и weight.
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //в) Добавить конструктор, который принимает на вход два параметра
    //для инициализации переменных класса - number, model.
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    //г) Добавить конструктор без параметров.
    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }
    //и) Добавить в класс Phone методы: receiveCall, имеет один параметр
    //– имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    //getNumber – возвращает номер телефона. Вызвать эти методы для
    //каждого из объектов.
    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        //д) Создайте три экземпляра этого класса.
        Phone phone1 = new Phone("123456789", "iPhone 15", 210.0);
        Phone phone2 = new Phone("987654321", "Samsung S23");
        Phone phone3 = new Phone();

        //ж) Присвоить значения полям класса.
        phone3.number = "676767676";
        phone3.model = "Xiaomi";
        phone3.weight = 180.0;

        //з) Выведите на консоль значения их полей.
        System.out.println("Phone 1: Number - " + phone1.number + ", Model - " + phone1.model + ", Weight - " + phone1.weight);
        System.out.println("Phone 2: Number - " + phone2.number + ", Model - " + phone2.model + ", Weight - " + phone2.weight);
        System.out.println("Phone 3: Number - " + phone3.number + ", Model - " + phone3.model + ", Weight - " + phone3.weight);

        // Вызов receiveCall и getNumber
        phone1.receiveCall("Vlad");
        System.out.println("Phone 1 number: " + phone1.getNumber());
        phone2.receiveCall("Olena");
        System.out.println("Phone 2 number: " + phone2.getNumber());
        phone3.receiveCall("Den");
        System.out.println("Phone 3 number: " + phone3.getNumber());
    }
}

