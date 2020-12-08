import java.util.Arrays;
public class MigratoryBirds {
    public static void main(String[] args) {
        //int[]birds={1,4,4,4,5,3}; (Test Case 1)
        int[]birds={1,2,3,4,5,4,3,2,1,3,4}; //(Test Case 2)
        int[]empty=new int[6];
        int max=0;
        int position=1;

        for(int i=0;i<birds.length;i++){
            empty[birds[i]]++;

        }
        for(int i=0;i<empty.length;i++){


        }
        for(int i=0;i<empty.length;i++){
            if(empty[i]>max){
                max=empty[i];
                position=i;

            }

        }
        System.out.println(position);


    }


        }






