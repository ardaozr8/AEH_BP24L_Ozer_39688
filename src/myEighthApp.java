public class myEighthApp {
    public static void main(String[] args) {
        // TASK 1 Test
        Person person = new Person("Arda", 21);
        person.greet();

        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // TASK 2 Test
        Account acc = new Account("1234567890", 1000.0, "Arda", "arda@example.com", "555-1234");
        acc.withdraw(900.0);
        acc.deposit(250.0);
        acc.withdraw(50.0);
        acc.withdraw(500.0);
    }
}
