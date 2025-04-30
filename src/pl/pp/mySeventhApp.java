package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John", 25, "New York", 1999);

        System.out.println("Initial info:");
        person.printInfo();

        // Increase age by 10 years
        System.out.println("\nPerson gets 10 years older:");
        person.growOld(10);
        person.printInfo();

        // Decrease age by 1 year
        System.out.println("\nPerson gets 1 year younger:");
        person.beYounger();
        person.printInfo();
    }
}
