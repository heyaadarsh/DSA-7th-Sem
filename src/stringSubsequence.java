import java.util.*;
public class stringSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        String ans = "";

        subsequence(str, ans);
    }

    static void subsequence(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        // In the left call we don't have to add.
        subsequence(str.substring(1), ans);

        // In the right call we have to add.
        subsequence(str.substring(1), ans+str.charAt(0));
    }
}
