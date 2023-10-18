public class PrimeInRange {
    public static void main(String[] args) {
        int range=20;
        boolean status=false;
        for(int i=2;i<=range;i++){
            for(int j=2;j<=(i/2);j++){
                if(i%j==0){
                    status=true;
                    break;
                } 
            }
            if(status==false){
                System.out.print(i+" ");
            }
            status=false;
        }
    }
}
