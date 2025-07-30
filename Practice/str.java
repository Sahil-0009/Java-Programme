public class str {
    public static void main(String[] args) {
        int age = 25;
        double weight = 60.32;
        if (age > 18) {
            if (weight > 50) {
                System.out.println("You are eligible for donate blood");
            } else {
                System.out.println("You must weigh at least 50 kilograms to donate blood. ");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }
        // if (b) {
        // System.out.println("b is true");
        // } else {
        // System.out.println("b is false");
        // }
    }
}
