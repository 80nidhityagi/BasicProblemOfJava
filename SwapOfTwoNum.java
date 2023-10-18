import java.util.*;
public class SwapOfTwoNum {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first value");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("a"+":"+ a);
   System.out.println("b"+":"+b);
 }   
}
