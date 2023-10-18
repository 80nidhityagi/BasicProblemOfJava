import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int rev=0;
        int m=n;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
            
        }
        if(m==rev){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
  sc.close();
    }
}
