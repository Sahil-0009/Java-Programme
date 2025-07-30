package Practice;

// class Second {
//     public void speed(int maxspeed) {
//         System.out.println("Max speed is : " + maxspeed);
//     }
// }

// public class Main {
//     static void myStaticMethod() {
//         System.out.println("Static methods can be called without creating objects");
//     }

//     public void myPublicMethod() {
//         System.out.println("Public methods must be called by creating objects");
//     }

//     public static void main(String[] args) {
//         myStaticMethod();

//         Main myObj = new Main();
//         myObj.myPublicMethod();
//         Second sp = new Second();
//         sp.speed(200);

//     }
// }
// public class Main {
//     int modelyear;
//     String modelname;

//     public Main(int year, String name) {
//         modelyear = year;
//         modelname = name;
//     }

//     public static void main(String[] args) {
//         Main myObj = new Main(1999, "Rahul");

//         System.out.println(myObj.modelname + " " + myObj.modelyear);
//     }
// }

// class Animal {
//     public void animalSound() {
//         System.out.println("The animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     int legs = 4;

//     public void animalSound() {
//         System.out.println("The dog says :  Bow Bow");
//     }
// }

// class Pig extends Dog {
//     public void animalSound() {
//         System.out.println("The pig says : Oink Oink");
//     }
// }

// /**
//  * Main
//  */
// public class Main {

//     public static void main(String[] args) {
//         Animal myAnimal = new Animal();
//         Animal myDog = new Dog();
//         Animal myPig = new Pig();
//         myAnimal.animalSound();
//         myDog.animalSound();
//         myPig.animalSound();
//     }
// }

// class Vehicle {
//     protected String brand = "Ford";

//     public void honk() {
//         System.out.println("Tuut Tuut");
//     }
// }

// class Car extends Vehicle {
//     private String modelName = "Mustang"; // Car attribute

//     public static void main(String[] args) {

//         // Create a myCar object
//         Car myCar = new Car();

//         // Call the honk() method (from the Vehicle class) on the myCar object
//         myCar.honk();

//         // Display the value of the brand attribute (from the Vehicle class) and the
//         // value of the modelName from the Car class
//         System.out.println(myCar.brand + " " + myCar.modelName);
//     }
// }

class Person {
    public String name;
    public String employeeID;
}

class Employee extends Person {
    public String employeeID;
}

class Student extends Person {
    public String studentID;
}

public class Main {

    public static void main(String[] args) {
        Student p1 = new Student();
        p1.name = "Sahil";
        p1.employeeID = "123";
        p1.studentID = "488";
        System.out.println("Name : " + p1.name);
        System.out.println("Employee ID : " + p1.employeeID);
        System.out.println("Student Id :" + p1.studentID);
    }
}