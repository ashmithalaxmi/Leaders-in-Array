import java.util.Scanner;

public class LeadersInArray {
    public static void leader(int[] arr, int n){

        int maximum=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maximum){
                maximum=arr[i];
                System.out.print(maximum + " ");
            }
        }
        System.out.print(arr[n-1]);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leader(arr,n);
    }
}
