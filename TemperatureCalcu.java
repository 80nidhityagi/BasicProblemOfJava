import java.util.Scanner;
public class TemperatureCalcu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter temperature in celcius");
        // float degCelcius=sc.nextInt();
        // float frhrenheit=degCelcius*(9/5)+32;
        // System.out.println("frhenheit temperature is:"+" "+frhrenheit);
        System.out.println("enter your height in meter");
        float height=sc.nextFloat();
        //System.out.println("enter your age");
        // int age=sc.nextInt();
         System.out.println("enter your weight in kg");
        float wg=sc.nextFloat();
        float bmi=wg/((height)*(height));
        System.out.println("your bmi is: "+bmi);

        sc.close();//bmi
    }
}
