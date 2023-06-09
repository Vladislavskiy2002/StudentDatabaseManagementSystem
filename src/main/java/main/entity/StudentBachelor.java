package main.entity;

import lombok.Data;

@Data
public class StudentBachelor extends Student {
    private String studentIdentifyCard;

    public StudentBachelor(Integer id, String type, String name, String surname, String email, Integer course, String studentIdentifyCard) {
        super(id, type, name, surname, email, course);
        this.studentIdentifyCard = studentIdentifyCard;
    }
    /**
     * Метод show - перевизначений метод абстрактного класу Student який виводить данні студента який є бакалавром
     */
    @Override
    public void show() {
        System.out.println("----------------------------");
        System.out.println("Information about student");
        System.out.println("\tCurrent student is " + getType());
        System.out.println("\tName: " + getName());
        System.out.println("\tSurname: " + getSurname());
        System.out.println("\tEmail: " + getEmail());
        System.out.println("\tCourse: " + getCourse());
        System.out.println("\tStudentIdentifyCard: " + getStudentIdentifyCard());
    }
}
