
class Student {

    int rollNo;
    String name;
    int marks;
}

public class studentList {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rohan";
        s1.rollNo = 5;
        s1.marks = 88;

        Student s2 = new Student();
        s2.name = "Ajoy";
        s2.rollNo = 3;
        s2.marks = 82;

        Student s3 = new Student();
        s3.name = "Suman";
        s3.rollNo = 2;
        s3.marks = 89;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student n : students) {
            System.out.println(n.name + " : " + n.marks);
        }
        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " : " + students.marks);
        // }
    }
}
