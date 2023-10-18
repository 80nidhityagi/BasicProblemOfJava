import java.util.Scanner;

public class Temperatur {
   public static void main(String[] args) {
    
    System.out.println("enter the temperature choice");
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    // int ch=new sc.nextInt();
    switch(ch){
        case 1:
        System.out.println("enter the temp in farhenite");
        float farhenite=sc.nextFloat();
        System.out.println("temperature in celcius is:"+((5/9)*(farhenite-32)));
        break;
        case 2:
        System.out.println("enter the temp in celcius");
        float cel=sc.nextFloat();
        System.out.println("temperature in farhenite is:"+(((cel)*(9/5))+32));
        break;
    }
sc.close();
   } 
}
