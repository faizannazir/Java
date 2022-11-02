import java.util.Scanner;
class first
{
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inp;
        System.out.print("Enter a Word : " );
        inp= input.next();
        System.out.println(" output = " + inp);

    }
}

class second
{
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inp;
        System.out.print("Enter a Sentence : " );        
        inp = input.nextLine();
        System.out.println("output = " + inp);
    }
}