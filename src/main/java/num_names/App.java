/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package num_names;
import java.util.Scanner;

public class App 
{
    static Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {
        int month_num;
        String month;
        System.out.println( "Please enter the number of the month." );
        month_num = myObj.nextInt();

        switch (month_num) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "You are out of Range\nPlease enter a number that corresponds to a month";
        }
        System.out.println("The name of the month is "+month);
    }
}
