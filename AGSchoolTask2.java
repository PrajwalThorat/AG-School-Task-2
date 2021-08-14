import java.util.Scanner;
public class AGSchoolTask2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number Of Student : ");
        int noOfStudent = scanner.nextInt();


        String[] Name = new String[noOfStudent];
        String[] rollNumber = new String[noOfStudent];
        int[] Math = new int[noOfStudent];
        int[] Science = new int[noOfStudent];
        int[] English = new int[noOfStudent];
        int[] Language = new int[noOfStudent];
        int[] socialStudies = new int[noOfStudent];
        double[] totalMarks = new double[noOfStudent];
        double[] average = new double[noOfStudent];

        for(int i=0 ; i<noOfStudent ; i++){
            System.out.println("Enter the "+(i+1)+" Student Details");
            System.out.print("Enter the Name       : ");
            Name[i] = scanner.next();
            System.out.print("Enter the Roll Number : ");
            rollNumber[i] = scanner.next();
            System.out.println("Enter the Marks of the Student out of 100");
            System.out.println("Subject    Max. Marks       Marks Obtains");
            System.out.print(" Math           100                ");
            Math[i] = scanner.nextInt();
            System.out.print("Science         100                ");
            Science[i] = scanner.nextInt();
            System.out.print("English         100                ");
            English[i] = scanner.nextInt();
            System.out.print("Language        100                ");
            Language[i] = scanner.nextInt();
            System.out.print("Social Studies  100                ");
            socialStudies[i] = scanner.nextInt();
            System.out.println("--------------------------------------");
            totalMarks[i] = Math[i] + Science[i] + English[i] + Language[i] + socialStudies[i];
            System.out.println("Total           600                "+totalMarks[i]);
            average[i] = totalMarks[i]/5;
            System.out.println("Average        : "+average[i]);
        }
        int passStudent = 0;
        int failStudent = 0;
        for(int i=0 ; i<noOfStudent ; i++){
            if(Math[i]>35){
                if(Science[i]>35){
                    if(English[i]>35){
                        if(Language[i]>35){
                            if(socialStudies[i]>35){
                                System.out.println("--Passed Student--\nName\t\tRoll Number");
                                System.out.println(""+Name[i]+"\t\t"+rollNumber[i]);
                                passStudent++;
                            }
                        }
                    }
                }
            }else{
                System.out.println("--Fail Student--\nName\tRoll Number");
                System.out.println(""+Name[i]+"\t"+rollNumber[i]);
                failStudent++;
            }
        }System.out.println("Passed Student = "+passStudent+"\tFailed Student = "+failStudent);
    }
}