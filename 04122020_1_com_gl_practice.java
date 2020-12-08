public class DayofTheProgrammer {
    public static void main(String[] args) {
        //Input year
        //Test Case 1
        //y=2017
        /* Test Case 2
        y=2016
        Test Case 3
        y=1800
        */

        int y=1800;
        //days in 8 months of a non-leap year
        int days_of_nleap=243;
        //days of 8months in a leap year
        int days_of_leap=244;
        if(y>=1918 && y<=2700){
            if(y%100!=0 && y%4==0){
                int day_of_programmer=256-244;
                System.out.println("the day of the programmer is "+day_of_programmer+"."+"09"+"."+ y);
            } else if(y%400==0){
                int day_of_programmer=256-244;
                System.out.println("the day of the programmer is "+day_of_programmer+"."+"09"+"."+ y);
            }
            else{
                int day_of_programmer=256-243;
                System.out.println("the day of the programmer is "+day_of_programmer+"."+"09"+"."+ y);

            }
        }
        else if(y>=1700 && y<=1917){
            if(y%4==0){
                int day_of_programmer=256-244;
                System.out.println("the day of the programmer is "+day_of_programmer+"."+"09"+"."+y);

        } else{
                int day_of_programmer=256-243;
                System.out.println("the day of the programmer is "+day_of_programmer+"."+"09"+"."+ y);
            }

    }
}
}
