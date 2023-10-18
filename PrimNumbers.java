import java.util.Scanner;

public class PrimNumbers {
    public static void main(String[] args) {
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    boolean status=false;
    int num=sc.nextInt();
    for(int i=2;i<num/2;i++){
        if(num%i==0){
        status=true;
        break;
        }
    }
    if(status==false)System.out.println("yes it is prime");
    else System.out.println("no it is not prime");
    sc.close();
    }
}
