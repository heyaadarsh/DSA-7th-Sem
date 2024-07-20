
import java.util.*;

public class noConsecutiveHeads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";

//        ArrayList<String> lst = new ArrayList<>();
//        ArrayList<String> ans = new ArrayList<>();
//
//        printHT(n, str, lst);
//
//        for(int i = 0; i<lst.size(); i++){
//            String temp = lst.get(i);
//
//            boolean flag = false;
//
//            for(int j = 1; j<temp.length(); j++){
//                if(temp.charAt(j)==temp.charAt(j-1) && temp.charAt(j)=='H'){
//                    flag = true;
//                }
//            }
//
//            if(!flag){
//                ans.add(temp);
//            }
//        }
//
//        System.out.println(ans);

        int cnt = 0;

        printHT(n, str, cnt);
    }

    static void printHT(int n, String str, int cnt){
        if(str.length()==n){
            System.out.println(str);
            return;
        }

        if(cnt<1)
        printHT(n, str+"H", cnt+1);

        printHT(n, str+"T", 0);
    }
}
