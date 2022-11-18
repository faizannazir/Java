// A school has following rules for grading system: (Below 25)->F (25 to 45)->E (45 to 50)->D (50 to 60)->C  (60 to 80)->B  (Above 80)->A
// Ask user to enter marks and print the corresponding grade.
import java.util.Scanner;                     // importing Scanner class for taking input from user 
class Grades
{
    public static void main(String[] args) 
    {
        // variables declaration
        int number;                                   // number variable to store input value
        Scanner sc= new Scanner(System.in);           // Scanner class object created 
        
       // print on cmd to ask user for a numer    
        System.out.print("Please Enter numbers for a subject out of 100 : ");  
        number = sc.nextInt();                          //Storing input number 
            if(number>80)
            {
                System.out.println("A grade");
            }
            else if(number>60)
            {
                System.out.println("B grade");
            }
            else if(number>50)
            {
                System.out.println("C grade");
            }
            else if(number>45)
            {
                System.out.println("D grade");
            }
            else if(number>25)
            {
                System.out.println("E grade");
            }
            else
            {
                System.out.println("F grade");
            }
    }
}
