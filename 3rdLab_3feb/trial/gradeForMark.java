import java.util.Scanner;

public class gradeForMark {
    public static void main(String[] args) {
      int m=89;


      char grade ='O';
      if (m>=90)
          grade ='E';
        if (m>=80)
            grade ='A';
        if (m>=70)
            grade ='B';
        if (m>=60)
            grade ='C';
        if (m>=50)
            grade ='D';
        if (m>=40)

        System.out.println("Grade:" + grade);
    }
}
