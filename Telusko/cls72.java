enum Laptop {
    Macbook(100000), XPS(30000), Surface, ThinkPad(18000);

    private int price;

    private Laptop() {
        price = 2000;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class cls72 {
    public static void main(String[] args) {

        // Laptop laptop = Laptop.Macbook;
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }

    }
}
