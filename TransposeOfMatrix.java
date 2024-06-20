import java.util.*;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] tran=new int [rows][cols];


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                tran[i][j]=sc.nextInt();

            }
        }

        for(int j=0;j<cols;j++){
            for(int i=0; i<rows;i++){
                System.out.print(tran[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
