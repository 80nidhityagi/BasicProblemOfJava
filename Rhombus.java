public class Rhombus {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        for(int i=1;i<=row;i++){
            for(int j=i-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=col;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
