public class Rombus2 {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        for(int i=1;i<=row;i++){
             for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
