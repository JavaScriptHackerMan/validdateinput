import java.util.Scanner;
public class UnitD35
{
    public static void main (String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int userYear, isLeapYear;
        System.out.println("Enter a year and it will be determined if it was/is a leap year or not.");
        userYear = userInput.nextInt();
        isLeapYear = userYear % 4;
        if (isLeapYear == 0)
        {
            isLeapYear %= 100;
            if (isLeapYear == 0)
            {
                isLeapYear %= 400;
                if (isLeapYear == 0)
                {
                    System.out.println(userYear + " is a leap year.");
                }
                else
                {
                    System.out.println(userYear + " is not a leap year.");
                }
            }
            else
            {
                System.out.println(userYear + " is a leap year.");
            }
        }
        else
        {
            System.out.println(userYear + " is not a leap year.");
        }
      
    }
}