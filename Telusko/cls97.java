import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class cls97 {
    public static void main(String[] args) {

        class Student {
            String name;
            int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String toString() {
                return "Student [name=" + name + ", age=" + age + "]";
            }

        }
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age > o2.age)
                    return 1;
                else
                    return -1;

            }
        };

        List<Student> nums = new ArrayList<>();
        nums.add(new Student("A", 20));
        nums.add(new Student("B", 25));
        nums.add(new Student("C", 30));
        nums.add(new Student("D", 35));
        nums.add(new Student("E", 40));
        // nums.add(200);
        // nums.add(3);
        // nums.add(40);
        // nums.add(53);
        Collections.sort(nums, com);
        for (Student student : nums) {
            System.out.println(student.toString());
        }

        // System.out.println(nums);

    }
}
