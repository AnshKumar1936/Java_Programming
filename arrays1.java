import java.util.*;
public class arrays1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=sc.nextInt();
        int[] num = new int [size];
        for (int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("Enter the no to search:");

        int x=sc.nextInt();
        // marks[0]=90;
        // marks[1]=99;
        // marks[2]=89;
        //System.out.println(marks[0]);
        // int marks[]={99,89,90};
        for(int i =0;i<size;i++){
            if(num[i]==x){
            System.out.print("Element found at that Position:");
            System.out.println(i);
            }
        }

        
    }
    
}
