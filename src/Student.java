import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double average;

    public Student(String name, String surname, int age, double average) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverage() {
        return average;
    }
}
