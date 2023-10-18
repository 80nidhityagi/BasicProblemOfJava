import java.util.Scanner;

public class WeekDayOrWeekEnd {
    public static void main(String[] args) {
         System.out.println("enter the day");
        Scanner sc=new Scanner(System.in);
        String  n=sc.next();
       
        switch(n){
            case "sunday":
            System.out.println("WeekEnd");
            break;
            case "monday":
            System.out.println("weekday");
            break;
             case "tuesday":
            System.out.println("weekday");
            break;
             case "wednesday":
            System.out.println("weekday");
            break;
             case "thursday":
            System.out.println("weekday");
            break;
             case "friday":
            System.out.println("weekday");
            break;
             case "saturday":
            System.out.println("weekEnd");
            break;
        }
        sc.close();
    }
}
