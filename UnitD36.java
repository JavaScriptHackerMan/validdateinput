import java.util.Scanner;
class UnitD36
{
    public static void main (String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int userYear, userMonth, leapYearCheck;
        boolean isLeapYear;
        System.out.println("Please enter a year and a month number, for example, 1 for January, 2 for February etc...");
        System.out.println("Year:");
        userYear = userInput.nextInt();
        System.out.println("Month:");
        userMonth = userInput.nextInt();    
        leapYearCheck = userYear % 4;
        
        if (leapYearCheck == 0)
        {
            leapYearCheck %= 100;
            if (leapYearCheck == 0)
            {
                leapYearCheck %= 400;
                if (leapYearCheck == 0)
                {
                    isLeapYear = true;
                }
                else
                {
                    isLeapYear = false;
                }
            }
            else
            {
                isLeapYear = true;
            }
        }
        else
        {
            isLeapYear = false;
        }
        
        switch (userMonth)
        {
            case 1:
            System.out.println("There are 31 days in January.");
            break;
            
            case 2:
            if (isLeapYear == true)
            {
                System.out.println("There are 29 days in February as it is a leap year.");
            }
            else if (isLeapYear == false)
            {
                System.out.println("There are 28 days in February.");
            }
            break;
            
            case 3:
            System.out.println("There are 31 days in March.");
            break;
            
            case 4:
            System.out.println("There are 30 days in April.");
            break;
            
            case 5:
            System.out.println("There are 31 days in May.");
            break;
            
            case 6:
            System.out.println("There are 30 days in June.");
            break;
            
            case 7:
            System.out.println("There are 31 days in July.");
            break;
            
            case 8:
            System.out.println("There are 31 days in August.");
            break;
            
            case 9:
            System.out.println("There are 30 days in September.");
            break;
            
            case 10:
            System.out.println("There are 31 days in October.");
            break;
            
            case 11:
            System.out.println("There are 31 days in November.");
            break;
            
            case 12:
            System.out.println("There are 31 days in December.");
            break;
            
            default:
            System.out.println("Please enter a valid number from 1-12.");
            break;
            
            
        }
        
    }
}