import java.util.Scanner;
class q4
{
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        int year =0;
        System.out.print("Enter a year : " );
        year = input.nextInt();
if(year%4==0&&year%100==0&&year%400==0)
{
    System.out.printf("%d is  Leap year " , year);
}
else
{
    System.out.printf("%d is  not a leap year " , year);
}
        
        
    }
}