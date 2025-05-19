package pl.pp;

public class myNinthApp {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        p1.greet();

        Circle c1 = new Circle(5.0);
        System.out.println("Circle radius: " + c1.getRadius());
        System.out.println("Circle area: " + c1.getArea());
        System.out.println("Circle circumference: " + c1.getCircumference());

        Warehouse w = new Warehouse(1, 5000, "John Smith", "john@example.com", "+48 111 222 333");
        w.addGoods(3000);
        w.removeGoods(1000);
        w.addGoods(2500);
        w.checkOccupancy();
        w.updateContact("owner@magazyn.pl", "+48 123 456 789");
        w.addGoods(1000); // fazla yükleme denemesi
    }
}
