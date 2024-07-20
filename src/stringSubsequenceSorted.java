import java.util.*;

public class stringSubsequenceSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        String ans = "";

        ArrayList<String> lst = new ArrayList<>();

        subsequence(str, ans, lst);

        Collections.sort(lst);

        System.out.println(lst);
    }

    static void subsequence(String str, String ans, ArrayList<String> lst){
        if(str.length()==0){
            lst.add(ans);
            return;
        }

        // In the left call we don't have to add.
        subsequence(str.substring(1), ans, lst);

        // In the right call we have to add.
        subsequence(str.substring(1), ans+str.charAt(0), lst);
    }
}
