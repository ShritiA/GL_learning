import java.lang.Math;
import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s.replaceAll("\\s","");
        System.out.println(s);
        int L=0;
        for(int i=0;i<s.length();i++){
            L++;
        }
        double x=Math.sqrt(L);
        //System.out.println(x);
        int intVAlue=(int)x;
        int row=intVAlue;
        int col=intVAlue+1;

       if(row*col<=L){
            row=row+1;
        }



        System.out.println(row);
        System.out.println(col);

     for (int i = 0; i < col; i++)
        {
            for (int j = 0; j <row; j++) {
                if(j*col+i<L){
                char a = s.charAt(j * col + i);
                System.out.print(a);


                }

            }
            System.out.print("\t");



        }




    }
}
