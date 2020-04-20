package Wk_1;

// Ryan Hoang
// CECS 274-05
// Prog 1 - Marathon
// Feb 11, 2020

import java.util.Scanner;

public class Marathon_Verson2 {

    public static void setMarathonTime(int minute, double secs, String RunnerName) {
        double eliud_hr = 1 * 3600;
        double eliud_min = 59 * 60;
        double eliud_sec = 40;
        double eliud_distance = 26.21875;
        double eliudPaceInSec = ((eliud_hr + eliud_min + eliud_sec) / eliud_distance);

        double convertMinToSec = minute * 60;
        double time_in_sec  = convertMinToSec + secs;

        double marathonTime = 26.21875 * time_in_sec;
        int marathonHr = (int) (marathonTime / 3600);
        int marathonMin = (int) ((marathonTime - (marathonHr * 3600)) / 60);
        int marathonSec = (int) (marathonTime - (marathonHr * 3600 + marathonMin * 60));

        System.out.printf("At this rate your marathon time would be %01d:%02d:%02d \n",marathonHr,marathonMin,marathonSec);
        System.out.println("Good luck with your training!\n");

        System.out.println("Pace Table");
        System.out.printf("%-10s %-8s %s \n","Mile","Eliud",RunnerName);
        
        int i = 0;
        while(i < 27){
            if (i!=26) {
                double secEveryLap = time_in_sec * (i + 1);
                int myHr = (int) (secEveryLap / 3600);
                int myMin = (int) ((secEveryLap - (myHr * 3600)) / 60);
                int mySec = (int) ((secEveryLap - (myHr * 3600 + myMin * 60)));

                double eliudLapsTime = eliudPaceInSec * (i + 1);
                int eli_Hr = (int) (eliudLapsTime / 3600);
                int eli_Min = (int) ((eliudLapsTime - (eli_Hr * 3600)) / 60);
                int eli_Sec = (int) ((eliudLapsTime - (eli_Hr * 3600 + eli_Min * 60)));

                System.out.printf("%-10d %01d:%02d:%02d \t",i+1, eli_Hr,eli_Min,eli_Sec);
                System.out.printf("%01d:%02d:%02d \n", myHr, myMin, mySec);
            }
            else{
                double eli_mile_time = eliudPaceInSec * eliud_distance;
                int eliMarathonHr = (int) (eli_mile_time / 3600);
                int eliMarathonMin = (int) ((eli_mile_time - (eliMarathonHr * 3600)) / 60);
                int eliMarathonSec = (int) ((eli_mile_time - (eliMarathonHr * 3600 + eliMarathonMin * 60)));

                System.out.printf("%-10s %01d:%02d:%02d \t","26m, 385y",eliMarathonHr,eliMarathonMin,eliMarathonSec);
                System.out.printf("%01d:%02d:%02d \n",marathonHr,marathonMin,marathonSec);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Los Angeles Marathon Training Program");
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your distance: ");
        double miles = in.nextDouble();
        System.out.println("How long did it take?");
        System.out.print("How many hours: ");
        int hours = in.nextInt();
        System.out.print("How many minutes: ");
        int minutes = in.nextInt();
        System.out.print("How many seconds: ");
        int seconds = in.nextInt();
        double myPace = ((hours * 3600) + (minutes * 60) + seconds) / miles;
        int min = (int) (myPace / 60);
        double sec =  myPace - (min * 60);
        System.out.println("\nHi " + name);
        System.out.printf("Your pace is %d:%02d \n",min,(int)sec);
        setMarathonTime(min,sec,name);
    }
}