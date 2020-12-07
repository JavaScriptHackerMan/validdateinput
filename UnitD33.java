import java.lang.Math;
import java.util.Scanner;
class UnitD33
{
    public static void main (String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int userSelection, randNum1, randNum2, actualResult, userResult;
        randNum1 = (int)((Math.random()) * 10) + 1;
        randNum2 = (int)((Math.random()) * 10) + 1;
        System.out.println("Two numbers between 1-10 have been randomly generated.");
        System.out.println("You have the options between 1-3 to decide which operation to apply between the two generated numbers.");
        System.out.println("Select 1 for Addition.");
        System.out.println("Select 2 for Subtraction.");
        System.out.println("Select 3 for Multiplication.");
        userSelection = userInput.nextInt();
        System.out.print('\u000C');
        switch (userSelection)
        {
            case 1: 
            actualResult = randNum1 + randNum2;
            System.out.println("You have selected Addition.");
            System.out.println("What is " + randNum1 + "+" + randNum2 + "?");
            userResult = userInput.nextInt();
            if (userResult == actualResult)
            {
                System.out.println("Your answer is correct! Good Job!");
            }
            else
            {
                System.out.println("Your answer is incorrect!");
            }
            break;
            
            case 2:
            actualResult = randNum1 - randNum2;
            System.out.println("You have selected Subtraction.");
            System.out.println("What is " + randNum1 + "-" + randNum2 + "?");
            userResult = userInput.nextInt();
            if (userResult == actualResult)
            {
                System.out.println("Your answer is correct! Good Job!");
            }
            else
            {
                System.out.println("Your answer is incorrect!");
            }
            break;
            
            case 3:
            actualResult = randNum1 * randNum2;
            System.out.println("You have selected Multiplication.");
            System.out.println("What is " + randNum1 + "x" + randNum2 + "?");
            userResult = userInput.nextInt();
            if (userResult == actualResult)
            {
                System.out.println("Your answer is correct! Good Job!");
            }
            else
            {
                System.out.println("Your answer is incorrect!");
            }
            break;
            default:
            
            System.out.println("Please enter a valid option.");
            break;
        }
       
        
    }
}