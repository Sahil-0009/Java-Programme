public class var1 {
    public String geek;
    public int i;
    public Integer I;

    public var1() {
        this.geek = "Tanu";
    }

    public static void main(String[] args) {
        // int var = 12;
        // System.out.println("Local variable : " + var);
        // int x = 10;
        // String message = "Hello, world!";
        // System.out.println("X " + x);
        // System.out.println("Message = " + message);

        // if (x > 5) {
        // String result = "x is greater than 5";
        // System.out.println(result);
        // }

        // for (int i = 0; i <= 3; i++) {
        // String loopMessage = "Iteration " + i;
        // System.out.println(loopMessage);

        // }

        var1 name = new var1();
        System.out.println("Geek name is " + name.geek);
        System.out.println("Default value for int is " + name.i);
        System.out.println("Default value for Integer is " + name.I);
    }
}
