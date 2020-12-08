import java.util.Scanner;
import java.util.Arrays;
public class SockMerchantProblem {
    public static void main(String[] args) {
        int total=0;
        // array for colors of socks
        // Test Case 1
        // int[] colors={10,20,20,10,10,30,50,10,20};
        int[] colors = {1, 1, 3, 1, 2, 1, 3,3,3,3}; //Test Case 2
        Arrays.sort(colors);

        for(int i=0;i<colors.length-1;i++){
            if(i<colors.length && colors[i]==colors[i+1]){
                total++;
                i=i+1;
                }
            }
        System.out.println(total);
        }




    }

