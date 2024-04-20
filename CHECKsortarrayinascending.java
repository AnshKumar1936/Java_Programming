import java.util.Scanner;
public class CHECKsortarrayinascending {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=sc.nextInt();
        int num[]=new int [size];
        for (int i=0;i<size;i++){
            num[i]=sc.nextInt();
        } 
        boolean isascending=true;
        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                isascending=false;
                
            }

        }
        if(isascending){
            System.out.println("thr array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }
}
}
