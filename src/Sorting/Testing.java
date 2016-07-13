package Sorting;

class Student implements Comparable<Student> {
    int studId;
    String name;

    public Student(int studId, String name) {
        this.studId = studId;
        this.name = name;
    }

    public Student(int studId) {
        this.studId = studId;
    }

    @Override
    public int compareTo(Student student) {
        if (this.studId == student.studId)
            return this.name.compareTo(student.name);
        return this.studId - student.studId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Testing {

    public static void main(String arg[]) {

        Integer[] a = {12, 3, 4, 5, 1, 2, 3, 5, 9, 10};
        //Selection.sort(a);
        //Insertion.sort(a);
        //Shell.sort(a);
        //Merge.sort(a);
        MergeImproved.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Double[] b = {1.1, 1.3, 1.5, 1.0, 2.0, 1.1, 1.3, 1.5, 1.0, 2.0};
        //Selection.sort(b);

        /* Sort Student Object.
        Student[] s = new Student[5];

        s[0] = new Student(10, "Parth1");
        s[1] = new Student(10, "Parth");
        s[2] = new Student(44, "Raj");
        s[3] = new Student(12, "Pritesh");
        s[4] = new Student(10, "Papa");

        Selection.sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        */
    }
}