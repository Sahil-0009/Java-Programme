package Practice;

// abstract class Animal {
//     abstract void animalSound();

//     public void sleep() {
//         System.out.println("Zzz");
//     }
// }

// class Dog extends Animal {
//     @Override
//     public void animalSound() {
//         System.out.println("Woof");
//     }
// }

interface Animal {
    public void animalSound();

    public void sleep();

}

class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Woof");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Dog bg = new Dog();
        bg.animalSound();
        bg.sleep();
    }
}
