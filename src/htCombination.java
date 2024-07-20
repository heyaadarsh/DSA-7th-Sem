import java.util.*;
public class htCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = "";

        printHT(n, str);
    }

    static void printHT(int n, String str){
        if(str.length()==n){
            System.out.println(str);
            return;
        }

        printHT(n, str+"H");

        printHT(n, str+"T");
    }
}
