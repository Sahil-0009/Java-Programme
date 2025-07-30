class NavinException extends Exception {
    public NavinException(String message) {
        super(message);
    }
}

public class cls79 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        // int nums[] = new int[5];
        // String str = null;

        try {
            j = 18 / i;
            if (j == 0)
                throw new NavinException(" I do not want to print zero");
            // System.out.println(str.length());
            // System.out.println(nums[1]);
            // System.out.println(nums[5]);
        } catch (NavinException e) {
            j = 18 / 1;
            System.out.println("Thats the default output" + e);

        } catch (Exception e) {
            System.out.println("Caught an exception : " + e);
        }
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Stay in your limit : " + e);
        // }
        System.out.println(j);
        System.out.println("Bye");
    }
}
