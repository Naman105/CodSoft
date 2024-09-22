import java.util.Scanner;

public class student_grade_calcuator {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects=sc.nextInt();

        if(numSubjects<=0){
            System.out.println("Enter a exact number of subject.");
            return;
        }
        int totalMarks=0;
        int maxMarksPerSubject=100;

        for(int i=1;i<=numSubjects;i++){
            System.out.print("Enter marks obtained in particular subject "+i+"(out of 100):");
            int marks=sc.nextInt();

            if(marks<0||marks>maxMarksPerSubject){
                System.out.println("Marks should in the range of 0 to 100. Please enter valid marks.");
                i--;
            }
            else{
                totalMarks+=marks;
            }   
        }

        double averagePercentage=(double) totalMarks/(numSubjects*maxMarksPerSubject)*100;
        System.out.println("Total marks:" +totalMarks);
        System.out.println("Average Percentage:" +averagePercentage+ "%");

        String grade;

        if(averagePercentage>=90){
            grade="A+";   
        }
        else if(averagePercentage>=80){
            grade="A";
        }
        else if(averagePercentage>=70){
            grade="B";
        }
        else if(averagePercentage>=60){
            grade="C";
        }
        else if(averagePercentage>=50){
            grade="D";
        }
        else{
            grade="F";
        }
        
      System.out.println("Grade:" +grade);  
        



            
                         
        
    }
     
    
}
