import java.util.Scanner;
public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the steps in the hike");
        int steps=sc.nextInt();
        System.out.println("Enter the string for the steps");
        String []path=new String[steps];
        int counter=0;
        int valley=0;
        for(int i=0;i<path.length;i++) {
            path[i] = sc.next();
            if(path[i].equals("D")){
                counter--;
                if(counter==-1){
                    valley++;
                }
            } else if(path[i].equals("U")){
                counter++;
            }

            }
        System.out.println(valley);




    }
}
