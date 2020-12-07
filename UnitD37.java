import java.util.Scanner;
class UnitD37
{
        public static void main (String[] args)
        {
        Scanner userInput = new Scanner(System.in);
        int userYear, userMonth, userDay, leapYearCheck;
        boolean isLeapYear, dayIsValid, monthIsValid, yearIsValid, dateIsValid = true;
        System.out.println("Please enter a day, a year and a month number, for example, 1 for January, 2 for February etc...");
        System.out.println("Year:");
        userYear = userInput.nextInt();
        System.out.println("Month:");
        userMonth = userInput.nextInt(); 
        System.out.println("Day:");
        userDay = userInput.nextInt();
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
        
        if (userDay >= 1 && userDay <= 31)
        {
            if(userMonth == 2 && isLeapYear == false && userDay > 28)
            {
                dayIsValid = false;
            }
            else if (userMonth == 2 && isLeapYear == true && userDay == 29)
            {
                dayIsValid = false;
            }
        }
        else
        {
            dayIsValid = true;
        }
        if (userMonth >= 1 && userMonth <=12)
        {
            monthIsValid = true;
        }
        else
        {
            monthIsValid = false;          
        }
        if (userYear > 0 && userYear < 2021)
        {
            yearIsValid = true;         
        }
        else
        {
            yearIsValid = false;
        }
        
        
        if (dateIsValid = true)
        {
            System.out.println("The date entered is a valid one.");
        }
        else if (dateIsValid = false) 
        {
            System.out.println("You have entered an invalid date.");
        }
}
}