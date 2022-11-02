import java.util.Scanner;
class q2
{
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number =0;
        System.out.print("Enter a Number : " );
        number = input.nextInt();
if(number%2==0)
{
    System.out.printf(" Given number %d is  Even " , number);
}
else
{
    System.out.printf(" Given number %d is  Odd " , number);
}
        
        
}
}