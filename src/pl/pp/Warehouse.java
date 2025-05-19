package pl.pp;

public class Warehouse {
    private int warehouseNumber;
    private int capacity;
    private int usedSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    public Warehouse(int warehouseNumber, int capacity, String ownerName, String ownerEmail, String ownerPhone){
        this.warehouseNumber = warehouseNumber;
        this.capacity = capacity;
        this.usedSpace = 0;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    public void addGoods(int amount){
        if (usedSpace + amount <= capacity){
            usedSpace += amount;
            System.out.println("Added " + amount + " units. Remaining space: " + (capacity - usedSpace));
        } else {
            System.out.println("Not enough space. Remaining space: " + (capacity - usedSpace));
        }
    }

    public void removeGoods(int amount){
        if (amount <= usedSpace){
            usedSpace -= amount;
            System.out.println("Removed " + amount + " units. Remaining space: " + (capacity - usedSpace));
        } else {
            System.out.println("Cannot remove more than current occupancy.");
        }
    }

    public void checkOccupancy(){
        System.out.println("Occupied space: " + usedSpace + " units.");
        System.out.println("Available space: " + (capacity - usedSpace) + " units.");
    }

    public void updateContact(String email, String phone){
        this.ownerEmail = email;
        this.ownerPhone = phone;
        System.out.println("Contact updated: Email - " + email + ", Phone - " + phone);
    }
}
