class human {
    private int age;
    private String name;

    public human() {
        System.out.println("In constructor");
        age = 12;
        name = "Sahil";
    }

    public human(int a, String name) {
        this.age = a;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void /* abc() */ setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void /* ab() */ setName(String name) {
        this.name = name;
    }

}

public class Encap {
    public static void main(String[] args) {
        human h = new human();
        human h1 = new human(18, "Sahil");
        // h.setName("John"); /* h.abc("John") */
        // h.setAge(25); /* ab(23) */
        // h.age = 23;
        // h.name = "John";
        System.out.println(h.getAge() + " " + h.getName());
        System.out.println(h1.getAge() + " " + h1.getName());

    }
}
