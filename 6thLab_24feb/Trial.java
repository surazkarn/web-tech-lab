import java.util.*;

class students {
    int roll;
    String name;
    int cgpa;

    students() {
        roll = 0;
        name = "";
        cgpa = 0;
    }

    void get(int rn, String nm, int cg) {
        roll = rn;
        name = nm;
        cgpa = cg;
    }
}

class Lab6Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : -");
        int n = sc.nextInt();
        students arr[] = new students[n];
        int lowi = 0;
        for (int i = 0; i < n; i++) {
            arr[i].get(sc.nextInt(), sc.next(), sc.nextInt());
            if (arr[i].cgpa < arr[lowi].cgpa) {
                lowi = i;
            }
        }
        System.out.println(lowi);
        System.out.println("Student name with Lowest CGPA is " + arr[lowi].name);
    }
}