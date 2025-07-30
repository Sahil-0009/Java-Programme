class Student {
    int rollno;
    String name;
    int marks;
}

public class arrObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Sahil";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Ram";
        s3.marks = 99;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(
        // "Roll No: " + students[i].rollno + " Name: " + students[i].name + " Marks: "
        // + students[i].marks);
        // }
        for (Student s : students) {
            System.out.println("Roll No: " + s.rollno + " Name: " + s.name + " Marks: " + s.marks);
        }

    }
}
