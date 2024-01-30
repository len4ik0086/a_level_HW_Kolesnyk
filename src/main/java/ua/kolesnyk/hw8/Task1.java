package ua.kolesnyk.hw8;

//Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//аспирант отличается от студента наличием некой научной работы.
//а) Класс Student содержит переменные: String firstName, lastName,
//group. А также, double averageMark, содержащую среднюю оценку.
//б) Создать метод getScholarship() для класса Student, который
//возвращает сумму стипендии. Если средняя оценка студента равна 5, то
//сумма 100 грн, иначе 80.
//в) Переопределить этот метод в классе Aspirant. Если средняя оценка
//аспиранта равна 5, то сумма 200 грн, иначе 180.
//г) Создать массив типа Student, содержащий объекты класса Student и
//Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
public class Task1 {
    public static void main(String[] args) {
        //г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
        Student[] students = {
                new Student("Nikola", "Kuk", "GroupA", 4.9),
                new Student("Sofiia", "Look", "GroupB", 5.0),
                new Aspirant("Vlad", "Slom", "GroupC", 4.5, "Research on AI"),
                new Aspirant("Evelin", "Work", "GroupD", 5.0, "Research on Robotics")
        };

        // Вызвать метод getScholarship() для каждого элемента массива.
        for (Student student : students) {
            System.out.println("Scholarship for " + student.firstName + " " + student.lastName + ": " + student.getScholarship() + " UAH");
        }
    }
}