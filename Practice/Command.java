public class Command {
    public static void Names(String... n) {
        for (String name : n) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // if (args.length > 0) {
        // System.out.println("The command line " + " arguments are : ");
        // for (String val : args) {
        // System.out.println(val);
        // }
        // } else {
        // System.out.println("No command line arguments");
        // }
        // System.out.println(args[1]);
        Names("Hi", "Hello");
    }
}
