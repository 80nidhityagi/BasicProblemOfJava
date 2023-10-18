import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter lower bound and upper bound");
        Scanner sc=new Scanner(System.in);
        int lower=sc.nextInt();
        int upper=sc.nextInt();
        System.out.println("even Numbers");
        for(int i=lower;i<=upper;i++){
            if(i%2==0){
            System.out.print(i+" ");
            }
        }
        System.out.println("odd Numbers");
  for(int i=lower;i<=upper;i++){
            if(i%2!=0){
            System.out.print(i+" ");
            }      
        }
        sc.close();
    }
}
