package basics;

import encapsulation.encapsulation;

public class main {
    static class Person {
        String name;
        int age;
        static int count = 0;

        // public Person() {
        // count++;
        // System.out.println("Creating an object ");
        // }

        public Person(String name, int age) {
            // this();
            this.name = name;
            this.age = age;
        }

        void walk() {
            System.out.println(name + " is walking.");
        }

        void eat() {
            System.out.println(name + " is eating.");
        }

        void walk(int steps) {
            System.out.println(name + " walked " + steps + " steps.");
        }
    }

    static class Developer extends Person {
        String language;

        public Developer(String name, int age, String language) {
            super(name, age);
            this.language = language;
        }

        void code() {
            System.out.println(name + " is coding in " + language + ".");
        }
    }

    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.name = "Sahil";
        // p1.age = 25;
        // System.out.println(p1.name + " is " + p1.age + " years old.");
        // p1.walk();
        // p1.eat();
        // p1.walk(10); // Calling the overloaded method
        // System.out.println("Total persons created: " + Person.count);

        // Person p2 = new Person();
        // p2.name = "John";
        // p2.age = 30;
        // System.out.println(p2.name + " is " + p2.age + " years old.");
        // p2.walk();
        // p2.eat();
        // p2.walk(15); // Calling the overloaded method
        // System.out.println("Total persons created: " + Person.count);

        // Person p2 = new Person("Alice", 28);
        // System.out.println(p2.name + " is " + p2.age + " years old.");
        // p2.walk();
        // p2.eat();
        // p2.walk(20); // Calling the overloaded method
        // System.out.println("Total persons created: " + Person.count);

        // Developer dev = new Developer("Alice", 28, "Java");
        // System.out.println(dev.name + " is " + dev.age + " years old.");
        // dev.walk();
        // dev.eat();
        // dev.walk(25); // Calling the overloaded method
        // dev.code();

        // encapsulation encap = new encapsulation();
        // encap.doWork();
    }

}
