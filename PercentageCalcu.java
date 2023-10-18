import java.util.Scanner;
public class PercentageCalcu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enteer your name");
        String name=sc.nextLine();
        System.out.println("enter your rollno");
        int rollno=sc.nextInt();
        System.out.println("enter your math marks");
        int mathMarks=sc.nextInt();
        System.out.println("enter your physics marks");
         int phyMarks=sc.nextInt();
        System.out.println("enter your chemistry marks");
        int ChemMarks=sc.nextInt();
        System.out.println("enter your english marks");
        int englishMarks=sc.nextInt();
        System.out.println("enter your hindi marks");
        int hindiMarks=sc.nextInt();
        float TotaAvgMarks=(mathMarks+phyMarks+ChemMarks+englishMarks+hindiMarks);
       // float totalMarks=mathMarks+phyMarks+ChemMarks+englishMarks+hindiMarks;
       float percentage=(mathMarks+phyMarks+ChemMarks+englishMarks+hindiMarks)/5;
       System.out.println("Student name"+"   "+name);
       System.out.println("rollno"+"         "+rollno);
       System.out.println();

       System.out.println("Subject Name"+"    "+"External marks");
       System.out.println(" 1 math"+"         "+mathMarks);
       System.out.println(" 2 physics"+"      "+phyMarks);
       System.out.println(" 3 hindi"+"        "+hindiMarks);
       System.out.println(" 4 english"+"      "+englishMarks);
       System.out.println(" 5 chemistry"+"    "+ChemMarks);
       System.out.println();
       System.out.println(" total avg marks"+" "+TotaAvgMarks);
       System.out.println();
       System.out.println("Total percentage is:"+" "+percentage);
       sc.close();



    }
}
