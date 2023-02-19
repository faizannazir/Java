public class Palindrome
{
    public static void main(String[] args)
    {
        int number = 121;
        String b = String.valueOf(number);
        String a = "scs";
        boolean check = true;
        for(int i = 0; i<b.length(); i++)
        {
            if(b.charAt(i)!= b.charAt(b.length()-i-1))
            {
                check =false;
                break;
            }
            else
            {
                System.out.print(b.charAt(b.length()-i-1));
            }
        }

        if(check)
        {
            System.out.println("Given string is a palindrome");
        }
        else
        {
             System.out.println("Given string is not a palindrome");
        }
    }
}