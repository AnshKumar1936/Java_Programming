import java.util.Scanner;

public class maxandminArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=sc.nextInt();
        int num[]=new int [size];
        for (int i=0;i<size;i++){
            num[i]=sc.nextInt();
        } 
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
            else if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Largest num is:"+ max);
        System.out.println("Smallest numm is:"+ min);

        
    }
    
}
