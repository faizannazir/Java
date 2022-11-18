// A shop will give discount of 10% if the cost of purchased quantity is 
// more than 1000.
// Ask user for quantity.
// Suppose, one unit will cost 100.
// Judge and print total cost for user.
import java.util.Scanner;                     // importing Scanner class for taking input from user 
class Discount
{
    public static void main(String[] args) 
    {
        // variables declaration
        int quantity;                         // quantity of product 
        int price = 100;                     // price of product per unit
        int total;                          // total price 
        int discount;                       // discount on purchase
        Scanner sc= new Scanner(System.in);           // Scanner class object created 
        
       // print on cmd to ask user for quantity        
        System.out.print("Please Enter quantity of product you purchased : ");  
        quantity = sc.nextInt();         //Storing input given by user in quantity variable
        total = price * quantity;        // calculating total price
        if(total>1000)                  // check if total bill is greater than 1000
        {
            System.out.println("Total "+total);       //Printing total
            discount = (total/100)*10;             // calculating  10% discount
            total = total - discount;              // updating total with 10% discount
            // Printing total bill on cmd after 10% discount 
            System.out.println("Your total bill after 10% discount is  "+total);
        }
        else                            // else condition if total is less than 1000
        {
            System.out.println("Your total bill is "+total);       //Printing bill
        }
    }
}
