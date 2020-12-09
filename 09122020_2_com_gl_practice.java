import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigInteger;

public class ExtraLongFractorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int n =25;
        System.out.println(fact(n));
    }
    static BigInteger fact(int n){
        BigInteger f=new BigInteger("1");
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }




    }






