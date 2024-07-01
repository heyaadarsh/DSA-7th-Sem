import java.util.*;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-7, -2, -6, -4, -1};

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<5; i++){
            sum += arr[i];
            max = Math.max(sum, max);
            if(sum<0){
                sum = 0;
            }
        }

        System.out.println(max);
    }
}
