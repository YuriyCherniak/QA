package Homework;

public class User {
    int age;
    String name;
    int weight;
    boolean sex;
    String speciality;

    public User(int age, String name, int weight, boolean sex, String speciality) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "User has " + age + "years old, name is " + name + ". The weight is " + weight +
                ", is it men? - " + sex + ", with speciality of " + speciality;
    }


}
