import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        // No.of candles==age
        System.out.println("Enter the different candles with different heights");
        int[]candles=new int[age];
         for(int i=0;i<age;i++){
             candles[i]=sc.nextInt();
         }
        int max=0;
         for(int i=0;i<candles.length;i++){
             if(candles[i]>max){
                 max=candles[i];
             }
         }
        int count=0;

        for(int i=0;i<candles.length;i++){
            if(candles[i]==max){
                count++;

            }
        }
        System.out.println(count);

    }
}
