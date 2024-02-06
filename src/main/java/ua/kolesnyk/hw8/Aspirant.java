package ua.kolesnyk.hw8;
//Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//аспирант отличается от студента наличием некой научной работы.
class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    //в) Переопределить этот метод в классе Aspirant. Если средняя оценка
    //аспиранта равна 5, то сумма 200 грн, иначе 180.
    @Override
    public int getScholarship() {
        int scholarship;
        if (averageMark == 5) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return scholarship;
    }
}


