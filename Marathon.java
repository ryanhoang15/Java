package Wk_2;

// Ryan Hoang
// CECS 274-05
// Prog 1 - Marathon
// Feb 11, 2020

import java.util.Scanner;

public class Marathon {

    public static void setMarathonTime(int min, double sec, String runnerName ) {
        double distance = 26.21875;
        double eliudPaceInSec = (1 * 3600 + 59 * 60 + 40) / distance;

        double convertMinToSec = min * 60;
        double time_in_sec  = convertMinToSec + sec;

        double marathonTime = distance * time_in_sec;
        int marathonHr = (int) (marathonTime / 3600);
        int marathonMin = (int) ((marathonTime - (marathonHr * 3600)) / 60);
        int marathonSec = (int) (marathonTime - (marathonHr * 3600 + marathonMin * 60));

        System.out.printf("At this rate your marathon time would be %01d:%02d:%02d \n",marathonHr,marathonMin,marathonSec);
        System.out.println("Good luck with your training!\n");
        System.out.println("Pace Table");
        System.out.printf("%-10s %-8s %s \n","Mile","Eliud",runnerName);
        
        int i = 0;
        while (i < 27) {
            if(i != 26) {
                // this loop is calculating the pace time for every mile in a marathon for Eliud and the Competitor times
                // and the variable eliudSecsInMin and minRemain are used to store the fraction of the minutes in and use it to
                // subtract from the pace in minutes to get the whole minute and to use it again to times it by 60 to get the seconds
                // the other while loop is to calculate the hours by incrementing hours by 1 for every time minutes is greater than 60 minutes
                double paceEveryMile = eliudPaceInSec * (i + 1);
                double eliudPaceInMin = paceEveryMile / 60;
                double eliudSecsInMin = eliudPaceInMin - Math.floor(eliudPaceInMin);
                int eliudNewMin = (int) (eliudPaceInMin - eliudSecsInMin);
                int eliudNewSecs = (int) (eliudSecsInMin * 60);
                int eliudHrOver = 0;
                while (eliudNewMin > 60) {
                    eliudNewMin = eliudNewMin - 60;
                    eliudHrOver++;
                }
                
                double secEveryLap = time_in_sec * (i + 1);
                double minPace = secEveryLap / 60;
                double minRemain = minPace - Math.floor(minPace);
                int myMin = (int) (minPace - minRemain);
                int mySec = (int) (minRemain * 60);
                int myHr= 0;
                while (myMin > 60) {
                    myMin = myMin - 60;
                    myHr++;
                }
                System.out.printf("%-10d %01d:%02d:%02d \t",i+1, eliudHrOver, eliudNewMin, eliudNewSecs);
                System.out.printf("%01d:%02d:%02d \n", myHr, myMin, mySec);
            }

            // this else statement is calculating the pace time for the 26 mile 385 yards for eliud and printing it out
            // and for the competitor's time for the 26 mile 385 yards is already calculated outside the while loop
            // so it is printing it out by calling it from outside the loop
            else {
                double mileTime = distance * eliudPaceInSec;
                int eliLastHr = (int)((mileTime/3600.0));
                int eliLastMin = (int)((mileTime - (eliLastHr * 3600))/60);
                int eliLastSec = (int)(mileTime - (eliLastHr * 3600 + eliLastMin * 60));
                System.out.printf("%-10s %01d:%02d:%02d \t","26m, 385y",eliLastHr,eliLastMin,eliLastSec);
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
        int myPaceMin = (int) (myPace / 60);
        double myPaceSec =  myPace - (myPaceMin * 60);
        System.out.println("\nHi " + name);
        System.out.printf("Your pace is %d:%02d \n",myPaceMin,(int)myPaceSec);
        setMarathonTime(myPaceMin,myPaceSec,name);
    }
}

