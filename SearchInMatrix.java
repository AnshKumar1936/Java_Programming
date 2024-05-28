import java.util.*;
public class SearchInMatrix {
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
        System.out.println("enter element you want to find");

        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(array[i][j]==x){
                    System.out.print("x found at this location(" + i + "," + j + " )");

                }
                
            }
            System.out.println();
        }

    }

    
}