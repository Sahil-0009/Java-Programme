import java.util.HashMap;
import java.util.Map;

public class cls96 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Sahil", 10);
        students.put("Rahul", 30);
        students.put("Hil", 11);
        students.put("Sahil", 40);
        System.out.println(students);
    }
}
