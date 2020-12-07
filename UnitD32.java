import java.util.Scanner;
class UnitD32
{
    public static void main (String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int userSelection;
        double userValue, conversionResult;
        System.out.print("Welcome to the currency converter. Please select Option 1 if you want to convert US Dollars to Euro or Option 2 ");
        System.out.println("if you would like to convert from Euro to US Dollar.");
        
        userSelection = userInput.nextInt();
        switch (userSelection)
        {
            case 1:
            System.out.println("Please enter the US Dollar value you would like to convert to Euro.");
            userValue = userInput.nextDouble();
            conversionResult = userValue * 0.86;
            System.out.println("$" + userValue + " is equal to €" + conversionResult + ".");
            break;
            
            case 2:
            System.out.println("Please enter the Euro value you would like to convert to US Dollar.");
            userValue = userInput.nextDouble();
            conversionResult = userValue * 1.21;
            System.out.println("€" + userValue + " is equal to $" + conversionResult + ".");
            break;
            
            default:
            System.out.println("Please enter a valid value");
            break;
        }
    }
}