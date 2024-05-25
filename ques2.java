import java.util.*;
public class ques2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the value of n");
        int n=sc.nextInt();
        int x=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(x+" ");
                x++;
            }
        System.out.println();
        
        }
    }
}
