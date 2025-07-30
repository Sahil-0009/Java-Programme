
class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop that) {
        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        } else {
            return false;
        }
    }
}

public class cls61 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.model = "HP";
        laptop.price = 12000;

        Laptop laptop1 = new Laptop();
        laptop1.model = "HP";
        laptop1.price = 20000;
        System.out.println(laptop1.toString());
    }
}
