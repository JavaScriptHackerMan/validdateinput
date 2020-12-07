import java.util.Scanner;
class UnitD31
{
    public static void main (String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        char paperAorB;
        byte userGrade;
        System.out.println("Please enter the grade you obtained for your O-Level (1-7).");
        userGrade = userInput.nextByte();
        System.out.println("Please enter the paper you attempted (A or B).");
        paperAorB = userInput.next().charAt(0);
        switch(userGrade)
        {
            case 1: System.out.println("Excellent!");
                    break;
            
            case 2: System.out.println("Very well done!");
                    break;
            
            case 3: System.out.println("Good job!");
                    break;
            
            case 4: if (paperAorB == 'a' || paperAorB == 'A') System.out.println("Not bad!");
                     else if (paperAorB == 'b' || paperAorB == 'B') System.out.println("Well Done!");
                    break;
                     
            case 5: if (paperAorB == 'a' || paperAorB == 'A') System.out.println("Study Harder!");
                     else if (paperAorB == 'b' || paperAorB == 'B') System.out.println("Good job!");
                    break;
                        
            case 6: System.out.println("Not bad!");
                    break;
                    
            case 7: System.out.println("Study harder!");
                    break;
                    
            default: System.out.println("Fail.");
            break;
        }
    }
}