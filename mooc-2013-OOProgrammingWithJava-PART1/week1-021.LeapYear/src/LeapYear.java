
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        int leapYear = year % 4;
        int leapYearCondOne = year % 100;
        int leapYearCondTwo = year % 400;
        if (leapYearCondOne == 0) {
            if (leapYearCondTwo == 0) {
                System.out.println("The year is a leap year. ");
            } else {
                System.out.println("The year is not a leap year.");
            }

        } else if (leapYear == 0) {
            System.out.println("This is a leap year.");
        }
        else {
            System.out.println("The year is not a leap year.");
            }
        }

    }


