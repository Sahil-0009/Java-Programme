package Practice;

// import bank;

// class Pen {
//     String color;
//     String type;

//     // public void write() {
//     // System.out.println("Writing");
//     // }

//     // public void printColor() {
//     // System.out.println(this.color);
//     // }

//     // public void printType() {
//     // System.out.println(this.type);
//     // }

// }

// class Student {
//     String name;
//     int age;

//     // public void printInfo() {
//     // System.out.println(this.name);
//     // System.out.println(this.age);
//     // }

//     // Student() {
//     // }

//     // Student(Student s2) {
//     // this.name = s2.name;
//     // this.age = s2.age;
//     // }

//     public void printInfo(String name) {
//         System.out.println(name);
//     }

//     public void printInfo(int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println(name + " " + age);
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         // Pen p1 = new Pen();
//         // p1.color = "Black";
//         // p1.type = "Ballpoint";
//         // p1.write();
//         // // p1.printColor();
//         // p1.printType();

//         // Pen p2 = new Pen();
//         // p2.color = "Blue";
//         // p2.type = "Fountain";
//         // p2.write();
//         // p2.printColor();
//         // // p2.printType();

//         // System.out.println("Pen Color: " + p1.color);
//         // System.out.println("Pen Type: " + p1.type);
//         Student s1 = new Student();
//         s1.name = "Rahul";
//         s1.age = 20;
//         // Student s2 = new Student(s1);
//         // // s1.printInfo();
//         // s2.printInfo();
//         s1.printInfo(s1.age);
//     }
// }

/*Inheritance */

// class Shape {
//     String color;

//     public void area() {
//         System.out.println("Display Area");
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println("Area of Triangle: " + (l * h) / 2);
//     }

// }

// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println("Area of Triangle: " + (l * h) / 2);
//     }
// }

// class Circle extends Shape {
//     public void area(int r) {
//         System.out.println("Area : " + (3.14 * r * r));
//     }
// }

// abstract class Animal {
//     abstract void walk();

//     Animal() {
//         System.out.println("Animal is created");
//     }

//     public void eat() {
//         System.out.println("Animal eats");
//     }

// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println("Horse is created");
//     }

//     public void walk() {
//         System.out.println("Horse is walking");
//     }

// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("Chicken is walking");
//     }
// }

interface Animal {
    void walk();

}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Horse is walking");
    }
}

public class oops {
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.color = "Red";
        // t1.area(10, 20);
        // Circle c1 = new Circle();
        // c1.area(11);

        // bank.Account acct1 = new bank.Account();
        // acct1.name = "Customer1";

        Horse horse = new Horse();
        horse.walk();
        // horse.eat();

    }
}
