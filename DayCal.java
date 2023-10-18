import java.util.Scanner;

public class DayCal {
    public static void main(String[] args) {
         System.out.println("enter the choicek");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        switch(n){
            case 1:
            System.out.println("SUNDAY");
            break;
            case 2:
            System.out.println("MONDAY");
            break;
             case 3:
            System.out.println("TUESDAY");
            break;
             case 4:
            System.out.println("WEDNESDAY");
            break;
             case 5:
            System.out.println("THRUSDAY");
            break;
             case 6:
            System.out.println("FRIDAY");
            break;
             case 7:
            System.out.println("SATURDAY");
            break;
        }
    }
}
