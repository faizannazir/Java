// Write a program to print absolute value of a number entered by user. 
// E.g.-
// INPUT: 1 OUTPUT: 1
// INPUT: -1 OUTPUT: 1


import java.util.Scanner;                     // importing Scanner class for taking input from user 
class Absolute
{
    public static void main(String[] args) 
    {
        // variables declaration
        int number;                                   // number variable to store input value
        Scanner sc= new Scanner(System.in);           // Scanner class object created 
        
       // print on cmd to ask user for a numer    
        System.out.print("Please Enter a number : ");  
        number = sc.nextInt();         //Storing input number 

        if(number>0) 
        {
            System.out.println("Absolute number of given number is : "+number);       //Printing absolute number
        }
        else                            // else condition if total is less than 0 mean negative 
        {
            
            System.out.println("Abolute of a given number is : "+(-(number)));       //Printing absolute number
        }
    }
}
