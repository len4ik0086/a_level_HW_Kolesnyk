package ua.kolesnyk.hw8;

class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    //а) Класс Student содержит переменные: String firstName, lastName,
    //group. А также, double averageMark, содержащую среднюю оценку.

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    //б) Создать метод getScholarship() для класса Student, который
    //возвращает сумму стипендии. Если средняя оценка студента равна 5, то
    //сумма 100 грн, иначе 80.
    public int getScholarship() {
        int scholarship;
        if (averageMark == 5) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return scholarship;
    }
}