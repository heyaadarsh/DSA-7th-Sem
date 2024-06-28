import java.util.*;
public class oneDPrefixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the " + (i+1) + "th element of the array: ");
            arr[i] = sc.nextInt();
        }

        int[] pre = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            pre[i] = sum;
        }

        System.out.println("Enter the number of questions: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the the starting index: ");
            int s = sc.nextInt();
            System.out.println("Enter the ending index: ");
            int e = sc.nextInt();

            int res = pre[e] - pre[s-1];
            System.out.println("Sum is: " + res);

            q--;
        }
    }
}
