import java.util.Scanner;

public class TaxCalcu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary");
        float sal=sc.nextFloat();
        if(sal<=10000){
            System.out.println("no tax");
        }
        else if(sal>10000&&sal<=20000){
            
            System.out.println(" net salary is:"+((sal*10)/100));
        }
        else if(sal>20000&&sal<=30000){
            System.out.println(" net salary is:"+(sal*15)/100);
        }
        else{
            System.out.println(" net salary is:"+(sal*25)/100);
        }
        sc.close();
    }
}
