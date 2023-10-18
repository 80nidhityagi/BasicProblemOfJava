public class HollowPiramid {
    public static void main(String[] args) {
        int row=10;
        for(int i=1;i<=row;i++){
            for(int j=row-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||i==row)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++){
                if(j==i||i==row)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
