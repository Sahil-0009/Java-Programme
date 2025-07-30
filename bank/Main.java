package bank;

// class Account {

//     public String name;
//     protected String email;
//     private String password;

//     public String getPassword() {
//         return this.password;
//     }

//     public String setPassword(String pass) {
//         return this.password = pass;
//     }

// }

// public class bank {
//     public static void main(String[] args) {
//         Account account1 = new Account();
//         account1.name = "Sahil";
//         account1.email = "sahil@gmail.com";
//         account1.setPassword("abcd");
//         System.out.println(account1.getPassword());
//     }

// }

// Encapsulation

// class BankAcct {
//     private double balance;

//     public BankAcct(double initialBal) {
//         balance = initialBal;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// public class bank {

//     public static void main(String[] args) {
//         BankAcct Bk = new BankAcct(10000);
//         Bk.deposit(1000);
//         Bk.withdraw(500);
//         System.out.println("Balance :" + Bk.getBalance());
//     }
// }

// Abstraction

// abstract class Shape {
//     abstract void draw();

//     void display() {
//         System.out.println("This is a shape");
//     }
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// public class bank {

//     public static void main(String[] args) {
//         Shape myShape = new Circle();
//         myShape.draw();
//         myShape.display();
//     }
// }

// Interface 
// interface Animal {
//     void eat();

//     void sleep();
// }

// class Cat implements Animal {
//     @Override
//     public void eat() {
//         System.out.println("The cat eats.");
//     }

//     @Override
//     public void sleep() {
//         System.out.println("The cat sleeps.");
//     }
// }

// public class bank {
//     public static void main(String[] args) {
//         Cat myCat = new Cat();
//         myCat.eat();
//         myCat.sleep();
//     }
// }

// abstract class Vehicle {
//     abstract void start();

//     abstract void stop();
// }

// class Car extends Vehicle {
//     public void start() {
//         System.out.println("Car started");
//     }

//     public void stop() {
//         System.out.println("Car stopped");
//     }
// }

// class Bike extends Vehicle {
//     public void start() {
//         System.out.println("Bike started");
//     }

//     public void stop() {
//         System.out.println("Bike stopped");
//     }
// }

// public class bank {

//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         Vehicle bike = new Bike();
//         car.start();
//         car.stop();
//         bike.start();
//         bike.stop();
//     }
// }

interface Playable {
    void play();

    void pause();
}

class MusicPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Playing music by clicking the triangular button.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music by clicking the square button.");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video by clicking the triangular button.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video by clicking the square button.");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        musicPlayer.play();
        musicPlayer.pause();
        videoPlayer.play();
        videoPlayer.pause();
    }
}
