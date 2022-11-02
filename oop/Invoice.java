// (Invoice Class) Create a class called Invoice that a hardware store might use to represent
// an invoice for an item sold at the store. An Invoice should include four pieces of information 
// as instance variables—a part number (type String), a part description (type String), a quantity 
// of the item being purchased (type int) and a price per item (double). Your class should have a 
// constructor that initializes the four instance variables. Provide a set and a get method for 
// each instance variable. In addition, provide a method named getInvoiceAmount that calculates 
// the invoice amount (i.e., multiplies the quantity by the price per item), then returns the 
// amount as a double value. if the quantity is not positive, it should be set to 0. if the price 
// per item is not positive, it should be set to 0.0. Write a test application named InvoiceTest 
// that demonstrates class Invoice’s capabilities.




class Invoice
{
 
 private String partNumber, partDescription;
 private int quantity;
 private double pricePerItem;
 Invoice()
 {
partNumber = "";
partDescription = "";
quantity =0;
pricePerItem=0.0;
 }

 public void setpartNumber(String partNumber)
 {
if(partNumber!=null)
{
    this.partNumber = partNumber;
}
 }

 public String getpartNumber()
 {
return this.partNumber;
 }
 

  public void setpartDescription(String partDescription)
 {
if(partDescription!=null)
{
    this.partDescription = partDescription;
}
 }

 public String getpartDescription()
 {
return this.partDescription;
 }

  public void setquantity(int quantity)
 {
if(quantity>0)

    this.quantity = quantity;
}
 

 public int getquantity()
 {
return this.quantity;
 }

  public void setpricePerItem(double pricePerItem)
 {
if(pricePerItem>0.0)
{
    this.pricePerItem =pricePerItem;
}
 }

 public double getpricePerItem()
 {
return this.pricePerItem;
 }

 public double getInvoiceAmount()
 {
    return this.quantity*this.pricePerItem;
 }
}

class InvoiceTest
{
    public static void main(String [] args)
    {
        Invoice inv1 = new Invoice();
        Invoice inv2 = new Invoice();
        inv1.setpartNumber("Number");
        inv1.setpartDescription("cpu");
        inv1.setpricePerItem(100);
        inv1.setquantity(5);

        System.out.println("Part Number: "+inv1.getpartNumber());
        System.out.println("Description: "+inv1.getpartDescription());
        System.out.println("Price per item: "+ Double.toString(inv1.getpricePerItem()));
        System.out.println("Quantity of item: "+Double.toString(inv1.getquantity()));
        System.out.println("Total: "+Double.toString(inv1.getInvoiceAmount())+"\n");


        inv2.setpartNumber("");
        inv2.setpartDescription("");
        inv2.setpricePerItem(-10);
        inv2.setquantity(-5);

        System.out.println("Part Number: "+inv2.getpartNumber());
        System.out.println("Description: "+inv2.getpartDescription());
        System.out.println("Price per item: "+ Double.toString(inv2.getpricePerItem()));
        System.out.println("Quantity of item: "+Double.toString(inv2.getquantity()));
        System.out.println("Total: "+Double.toString(inv2.getInvoiceAmount()));
    }
}