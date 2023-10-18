import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int num=sc.nextInt();
    if(num==0)
    System.out.println("factorial of :"+ num+" "+" "+num);
        while(num>0){
        fact=fact*num%10;
        num=num/10;
        }
        System.out.println("factoria of "+num+" "+"is"+" :"+fact);
        sc.close();
    }
}
