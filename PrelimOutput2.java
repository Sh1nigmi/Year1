//Renier Antony R. Hingco, 1-BSCS
import java.util.Scanner;
        
public class PrelimOutput2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first_name, middle_initial, last_name;
        
        System.out.println("-----------NAME-----------");
        System.out.println("First Name:");
        first_name = input.nextLine();
        System.out.println("Middle Initial:");
        middle_initial = input.nextLine();
        System.out.println("Last Name:");
        last_name = input.nextLine();
          
        
        double prelim_AG, prelim_CPG, prelim_QG, prelim_EG;
        
        System.out.println("----------PRELIM----------");
        System.out.println("Attendance Grade:");
        prelim_AG = input.nextDouble();
        System.out.println("Class Participation Grade:");
        prelim_CPG = input.nextDouble();
        System.out.println("Quiz Grade:");
        prelim_QG = input.nextDouble();
        System.out.println("Exam Grade:");
        prelim_EG = input.nextDouble();
        
        
        double midterm_AG, midterm_CPG, midterm_QG, midterm_EG;
        
        System.out.println("----------MIDTERM---------");
        System.out.println("Attendance Grade:");
        midterm_AG = input.nextDouble();
        System.out.println("Class Participation Grade:");
        midterm_CPG = input.nextDouble();
        System.out.println("Quiz Grade:");
        midterm_QG = input.nextDouble();
        System.out.println("Exam Grade:");
        midterm_EG = input.nextDouble();
        
        
        double final_AG, final_CPG, final_QG, final_EG;
        
        System.out.println("-----------FINAL----------");
        System.out.println("Attendance Grade:");
        final_AG = input.nextDouble();
        System.out.println("Class Participation Grade:");
        final_CPG = input.nextDouble();
        System.out.println("Quiz Grade:");
        final_QG = input.nextDouble();
        System.out.println("Exam Grade:");
        final_EG = input.nextDouble();
        
        
        double prelim_final, midterm_final, final_final, semester_grade;

        prelim_final = (prelim_AG*0.05) + (prelim_CPG*0.15) + (prelim_QG*0.3) + (prelim_EG*0.5) ;
        midterm_final = (midterm_AG*0.05) + (midterm_CPG*0.15) + (midterm_QG*0.3) + (midterm_EG*0.5);
        final_final = (final_AG*0.05) + (final_CPG*0.15) + (final_QG*0.3) + (final_EG*0.5);
        semester_grade = (prelim_final*0.25) + (midterm_final*0.25) + (final_final*0.5);   
       
        
        System.out.println("----------SUMMARY---------");
        System.out.println("Name: " + first_name + " " + middle_initial + ". " + last_name);
        System.out.println("Prelim Grade: " + prelim_final);
        System.out.println("Midterm Grade: " + midterm_final);
        System.out.println("Final Grade: " + final_final);
        System.out.print("Semester Grade: " + semester_grade + " " );
        if( semester_grade >= 95 && semester_grade <= 100 ) {
            System.out.println("(A)");
        }else if( semester_grade >= 90 && semester_grade <=95 ) {
            System.out.println("(B)");
        }else if( semester_grade >= 85 && semester_grade <=90 ) {
            System.out.println("(C)");
        }else if( semester_grade >= 80 && semester_grade <=85 ) {
            System.out.println("(D)");
        }else if( semester_grade >= 75 && semester_grade <=80 ) {
            System.out.println("(E)");
        }else if( semester_grade >= 60 && semester_grade <=75 ) {
            System.out.println("(F)");
        }else {
            System.out.println("(I)");
        }
        System.out.print("Status: " );
        if( semester_grade >= 75 && semester_grade <= 100 ) {
            System.out.println("PASSED");
        }else if( semester_grade >= 60 && semester_grade <=75 ) {
            System.out.println("FAILED");
        }
        System.out.println("--------------------------" );
        
    }
}
