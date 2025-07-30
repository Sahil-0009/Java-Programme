public class cls86 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            System.out.println("Bye");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Bye");
        }
    }
}
