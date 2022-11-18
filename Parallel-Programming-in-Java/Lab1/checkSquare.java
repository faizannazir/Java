import java.util.Scanner;                     // importing Scanner class for taking input from user 
class Check
{
    public static void main(String[] args) 
    {
        // variables declaration
        double breadth;                                 // breadth of rectangle
        double length;                                 // length of rectangle
        Scanner sc= new Scanner(System.in);           // Scanner class object created 
        
       // print on cmd to ask user for quantity        
        System.out.print("Please Enter breadth of a rectangle : ");  
        breadth = sc.nextDouble();                                //Storing input given by user in breadth variable
        System.out.print("Please Enter Length of a rectangle : ");  
        length = sc.nextDouble();                                 //Storing input given by user in breadth variable
        if(breadth == length)                                   // check if length of rectangle and breadth  of rectangle are equal or not 
        {
            System.out.println("Square");       
        }
        else                            
        {
            System.out.println("Not a Square ");
        }
    }
}
