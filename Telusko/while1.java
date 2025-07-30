public class while1 {
    public static void main(String[] args) {
        int i = 6;
        do {
            System.out.println(i + " Hi");
            int j = 1;
            while (j < 6) {
                System.out.println(j + " Hello");
                j++;
            }
            i++;
        } while (i < 6);
        System.out.println(i + " Bye");
    }

}
