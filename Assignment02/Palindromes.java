// Q.1: (Palindromes)  A  palindrome  is  a  sequence  of  characters  that  reads  the 
// same backward as forward. For example, each of the following five-digit integers 
// is a palindrome: 12321, 55555, 45554 and 11611. Write an application that reads 
// in a five-digit integer and determines whether it’s a palindrome. If the number is 
// not five digits long, display an error message and allow the user to enter a new 
// value.

import java.util.Scanner;
public class Palindromes
{
   private int num;
   private int check =0;
   private int temp,rem;

   public void setNum(int num)
   {
    while(String.valueOf(num).length()<5)
    {
        System.out.println("Try again , Please Enter a number 5 digits long: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
    }
        this.num = num;
   }

   public void checkNum()
   {
 temp = num;
  while(num>0){    
   rem=num%10; 
   check=(check*10)+rem;    
   num=num/10;    
  }   
  num =temp;
  if(num == check)
  {
    System.out.println("Number is Palindrome");
  }
  else
  {
    System.out.println("Number is not a Palindrome ");
  }
   }

    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Please Enter a 5 digit long number: ");
        a = sc.nextInt();
        Palindromes pd = new Palindromes();
        pd.setNum(a);
        pd.checkNum();
    }
}