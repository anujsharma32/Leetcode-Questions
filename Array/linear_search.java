import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int target = 49;
        boolean flag =false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element exists.");

        }
        else{
            System.out.println("Element doesn't exists.");
        }
        sc.close();
    }
    
}
