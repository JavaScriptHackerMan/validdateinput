import java.util.Scanner;
class UnitD34
{
    public static void main (String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        final int CORRECT_PIN = 5628;
        int userPin;
        double userWithdraw, available_balance = 36.23;
        System.out.println("Please enter your PIN.");
        userPin = userInput.nextInt();
        if (userPin == CORRECT_PIN)
        {
            System.out.println("How much money would you like to withdraw?");
            userWithdraw = userInput.nextDouble();
            if (userWithdraw <= available_balance)
            {
                available_balance -= userWithdraw;
                System.out.println("Money withdrawn, " + available_balance + " remaining in account.");
            }
            else
            {
                System.out.println("Not enough money in bank account.");
            }
        }
        
        else
        {
            System.out.println("Incorrect PIN entered.");
        }        
    }
}