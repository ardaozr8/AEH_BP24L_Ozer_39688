package pl.pp;

public class Person {
    private String name;
    private int age;

    // Newly added fields for Lab7
    private String address;
    private int yearOfBirth;

    public Person(String name, int age, String address, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    // Method to increase age by a given number of years
    public void growOld(int years) {
        this.age += years;
    }

    // Method to decrease age by 1
    public void beYounger() {
        if (age > 0) {
            this.age -= 1;
        }
    }

    // Print all information about the person
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}
