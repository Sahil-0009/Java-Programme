public class switch2 {
    public static void main(String[] args) {
        String day = "Monday";
        String result = "";
        result = switch (day) {
            case "Saturday", "Sunday":
                yield "Weekend";
            case "Monday":
                yield "Monday";
            default:
                yield "Normal Day";

        };
        System.out.println(result);

    }
}
