public class HollowTriangle {
    public static void main(String[] args) {
            int row=4;
            for(int i=1;i<=row;i++){
                for(int j=row-i;j>=1;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    if(j==1||j==i||i==row)
                    System.out.print("*");
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

