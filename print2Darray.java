import java.util.*;
public class print2Darray {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter no. of rows and columns");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    
}
