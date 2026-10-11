public class Ascii {
    public static void main(String args[]){
        int n=5;
       int value=65;
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
          System.out.print((char)(value+j));
        }
        System.out.println();
       }
    }
    
}
