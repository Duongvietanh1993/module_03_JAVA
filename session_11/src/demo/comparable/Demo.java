package demo.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        StudentComparable s1 = new StudentComparable(1);
        StudentComparable s2 = new StudentComparable(2);
        StudentComparable s3 = new StudentComparable(0);
        ArrayList<StudentComparable> students = new ArrayList<StudentComparable>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Collections.sort(students);

        System.out.println(s1.compareTo(s2) == 0 ? "s1==s2" : (s1.compareTo(s2) > 0 ? "s1>s2" : "s1<s2"));


        System.out.println("max"+Collections.max(students));
    }
}
