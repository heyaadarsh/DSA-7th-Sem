import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class noKConsecutiveHeads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();


        int cnt = 0;

        printHT(n, str, cnt, k);
    }

    static void printHT(int n, String str, int cnt, int k){
        if(str.length()==n){
            System.out.println(str);
            return;
        }

        if(cnt<k)
            printHT(n, str+"H", cnt+1, k);

        printHT(n, str+"T", 0, k);
    }
}
