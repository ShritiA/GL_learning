import java.util.Scanner;
import java.lang.Math;
public class SherlockandSquares {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value");
      int start=sc.nextInt();
        System.out.println("Enter ending value");
      int end=sc.nextInt();
      int count=0;
      int store=0;


      for(int i=0;i<=Math.sqrt(end);i++){
          if((i*i==0)|| (i*i==1)){
              continue;
          }
          else{
              store=i*i;

          }
          if(store>=start && store<=end){
             count++;

          }

          }
        System.out.println(count);









    }
}
