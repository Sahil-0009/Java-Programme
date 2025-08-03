package encapsulation;

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price, boolean isAdmin) {
        if (!isAdmin) {
            System.out.println("You are not authorized to set the price.");
            return;
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class encapsulation {

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.ram = 16;
        l1.setPrice(1000, true); // Pass true if the user is admin
        System.out.println("Laptop RAM: " + l1.ram + "GB");
        System.out.println("Laptop Price: $" + l1.getPrice());
    }

}
