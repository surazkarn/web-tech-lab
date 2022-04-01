
/*5. Write a program in java using inheritance to show how to call the base class
parameterized constructors from the derived class using super. */

import java.util.*;

class Teacher {
    String designation = "Teacher";
    String collegeName = "Alpine";

    void does() {
        System.out.println("Teaching");
    }
}

public class Lab6q5 extends Teacher {
    String mainSubject = "Physics";

    public static void main(String args[]) {
        Lab6q5 obj = new Lab6q5();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}