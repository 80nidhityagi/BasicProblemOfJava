import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        System.out.println("enter the any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;// 0 1 1 2 3
        int mid=1;
        int last=1;
        System.out.print(first+" "+last);
        while((n-2)>0){
             System.out.print(" "+last);
       
            first=mid;
            mid=last;
            last=first+mid;
        n=n-1;
     }
        
      sc.close();  
    }
}
