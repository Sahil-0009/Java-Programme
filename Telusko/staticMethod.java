class Mobile {
    String brand;
    int price;
    static String name;
    static {
        name = "Mobile";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "Samsung";
        price = 50000;
        System.out.println("In constructor");
    }

    // Instance method to show details
    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    // Static method should not access instance variables directly
    // public static void show1(Mobile mob) {
    // System.out.println("Brand: " + mob.brand);
    // System.out.println("Price: " + mob.price);
    // System.out.println("Name: " + name);
    // }

}

public class staticMethod {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Samsung";
        mobile1.price = 50000;
        Mobile.name = "Galaxy";

        Mobile mobile2 = new Mobile();

        // Mobile moble1 = new Mobile();
        // moble1.brand = "Samsung";
        // moble1.price = 30000;
        // Mobile.name = "Galaxy ";
        // moble1.show();

        // Calling static method and passing an instance
        // Mobile.show1(moble1);

    }
}
