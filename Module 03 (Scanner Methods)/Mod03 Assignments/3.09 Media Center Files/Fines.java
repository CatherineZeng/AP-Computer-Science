/**
 *Catherine Zeng
 *7-13-13
 *This program gives a library overdue notice according to input.
 *
 */
import java.util.Scanner;                       
public class Fines
{
    public static void main(String[] args)
    {       
        Scanner in = new Scanner(System.in);   
        
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = in.next();
        System.out.println("");
        //defining variables for today's date
       int month=Integer.parseInt(date.substring(0,2));
       int day=Integer.parseInt(date.substring(3,5));
       int year=Integer.parseInt(date.substring(6,10));
        
        
        System.out.print("Enter name (Last, First) and Social Security Number (###-##-####): ");
        String lastName = in.next();
        String firstName = in.next();
        String socialSecurityNumber = in.next();
        System.out.println("");
        
        System.out.print("Enter the title of the book: ");
        String bookTitle = in.next();
        String bookTitleContinued=in.nextLine();
        System.out.println("");
        
        System.out.print("Enter the date checked out (mm/dd/yyyy): ");
        String dateCheckedOut = in.next();
        System.out.println("");
        //define variables
       int monthsDue=Integer.parseInt(dateCheckedOut.substring(0,2));
       int daysDue=Integer.parseInt(dateCheckedOut.substring(3,5));
       int yearsDue=Integer.parseInt(dateCheckedOut.substring(6,10));
       //calculation for fine
       int daysOverDue=(year-yearsDue)*365+(month-monthsDue)*30+(day-daysDue);
       double dailyFine=7.99;      
       double totalFine=(double)daysOverDue*dailyFine;
       
       //printed statement
       System.out.println("Days late: "+daysOverDue);
       System.out.println("Daily fine: "+dailyFine);
       System.out.println("");
       System.out.println("");
       
       System.out.println("To: "+lastName+" "+firstName+ "\t\t\t" +"Account: "+lastName.replace(",","")+firstName+"-"+socialSecurityNumber.substring(7,11));
       System.out.println("From: Your evil librarian");
       System.out.println("Subject: Overdue Notice");
       System.out.println("---------------------------------------------");
       System.out.println(bookTitle+bookTitleContinued + " was checked out on: "+dateCheckedOut);
       System.out.println("This book is currently "+daysOverDue+" days late.");
       System.out.println("Your fine has accumulated to: "+totalFine);

    }
}