import java.util.Scanner;
class q3
{
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1 , number2;
        System.out.print("Enter 1st Number : " );
        number1 = input.nextInt();
        System.out.print("Enter 2nd Number : " );
        number2 = input.nextInt();
if(number1>number2)
{
    System.out.printf(" %d is  greater  than %d" , number1,number2);
}
else if(number1==number2)
{
 System.out.printf(" Both numbers are equal");
}
else
{
    System.out.printf(" %d is  greater  than %d" , number2,number1);
}
        
        
    }
}