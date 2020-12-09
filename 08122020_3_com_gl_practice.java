import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of prisoners");
        int n= sc.nextInt();
        System.out.println("Enter the number of sweets");
        int m= sc.nextInt();
        System.out.println("Enter the chair number to begin distribution from");
        int s=sc.nextInt();
        int remaining_candy=(m%n);
        int result=remaining_candy+s-1;
        if(result>n){
            result=result%n;
        }
        System.out.println(result);



        }


    }

