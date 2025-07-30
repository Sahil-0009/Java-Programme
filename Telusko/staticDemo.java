class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);

    }
}

public class staticDemo {
    public static void main(String[] args) {
        Mobile moble = new Mobile();
        moble.brand = "Samsung";
        moble.price = 50000;
        Mobile.name = "Galaxy";
        moble.show();

        Mobile moble1 = new Mobile();
        moble1.brand = "Samsung";
        moble1.price = 30000;
        Mobile.name = "Galaxy ";
        moble1.show();

    }
}
