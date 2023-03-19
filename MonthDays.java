/**
* The "MonthDays.java" file holds a temperature in Fahrenheit, and provide methods to get the temperature in Fahrenheit, Celsius, and Kelvin
* @author  Mohammad Seeam
*/

//To get user input
import java.util.Scanner;

/* Below is "MonthDays" class which has all veriables and necessary methods */
public class MonthDays {

    //To store month number
    private int month;

    //To store year
    private int year;

    //Array of number of days in months of a year
    private static int[] number_of_days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* Constructor */
    public MonthDays(int month, int year) {
        this.month = month;
        this.year  = year;
    }

    /* numberOfDays method checks if leap year or not and return day number of the month */
    public int numberOfDays(){

        // To check if leap year
        boolean leap_year = false;

        // Logic to check leap year
        if(year % 100 == 0) {
            if(year % 400 == 0) {
                leap_year = true;
            }
        }else if(year % 4 == 0) {
            leap_year = true;
        }

        //For february
        if(leap_year==true && month == 2) {
            return 29;
        }

        return number_of_days_in_month[month-1];
    }

    /* Below is main method */
    public static void main(String[] args) {
        //To take user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month [1-12] : ");
        //To store user input for month from 1 to 12
        int month = in.nextInt();
        if(month <= 0 || month > 12) {
            System.out.println("Invalid month : " + month);
            in.close();
            return;}
        System.out.print("Enter a year : ");
        //To store user input for year
        int year = in.nextInt();
        in.close();
        //making object
        MonthDays object = new MonthDays(month, year);
        //Getting value using object and it's function
        System.out.println(object.numberOfDays() + " days");
    }

}