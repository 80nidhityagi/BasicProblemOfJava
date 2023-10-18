import java.util.*;
public class Month {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter month");
    String month=sc.next();
    switch(month){
        case "january":
        System.out.println("winter");
        break;
        case "february":
        System.out.println("winter");
        break;
         case "march":
        System.out.println("Spring");
        break;
         case "april":
        System.out.println("Spring");
        break;
         case "may":
        System.out.println("summer");
        break;
         case "june":
        System.out.println("summer");
        break;
         case "july":
        System.out.println("rainy");
        break;
         case "august":
        System.out.println("rainy");
        break;
         case "september":
        System.out.println("rainy");
        break;
         case "october":
        System.out.println("rainy");
        break;
         case "november":
        System.out.println("winter");
        break;
         case "december":
        System.out.println("winter");
        break;
    }
    sc.close();

   } 
}
