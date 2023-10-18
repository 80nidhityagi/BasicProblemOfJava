import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num=sc.nextInt();
        while(num>0){
        sum=sum+num%10;
        num=num/10;
        }
        System.out.println("Sum of digit of the num: "+sum);
        sc.close();
    }
}
