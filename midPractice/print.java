// 2.30 (Separating the Digits in an Integer) Write an application 
// that inputs one number consisting of five digits from the user, 
// separates the number into its individual digits and prints the digits
// separated from one another by three spaces each. For example, 
// if the user types in the number 42339,
// the program should print   4   2   3   3   9
import java.util.Scanner;
public class print
{
    int number;
    Scanner inp = new Scanner(System.in);
    print(int number)
    {
        while(String.valueOf(number).length()!=5)
        {
            System.out.println("Please enter 5 digit long digit ");
            number = inp.nextInt();
        }
        this.number = number;
    }
    public void printResult()
    {
        int i = 0;
         String num = String.valueOf(number);
        while(i<num.length())
        {
            System.out.printf("%s ", num.charAt(i));
            i++;
        }
    }
    public static void main(String args[])
    {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please Enter a 5 digit Long number");
        a = inp.nextInt();
        print obj = new print(a);
        obj.printResult();
    }
}