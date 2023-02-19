// Q.2: (Salary  Calculator)  Develop  a  Java  application  that  determines  the  gross 
// pay for each of three employees. The company pays straight time for the first 40 
// hours worked by each employee and time and a half for all hours worked in excess of  40
//  You’re  given  a  list  of  the  employees,  their  number  of  hours  worked  last 
// week and their hourly rates. Your program should input this information for each 
// employee,  then  determine  and  display  the  employee’s  gross  pay.  Use  class 
// Scanner to input the data

import java.util.Scanner;

public class SalaryCalculator
{
    private int hours=0, rate=0, salary=0, temp=0;

    public void setHours(int hours)
    {
        if(hours>0)
        {
            this.hours = hours;
        }
        
    }
    public void setRate(int rate)
    {
        if(rate>0)
        {
           this.rate = rate; 
        }
        
    }
    
    public void calculateSalary()
    {
        if(hours<=40)
        {
            salary = rate * hours;
        }
        else
        {
            temp = rate * 40;
            hours -=40;
            salary = temp + (hours * rate);
        }
        System.out.println("Your salary is " + salary );
    }

    public static void main(String args[])
    {
        int rate[] = new int[3];
        int hour[] = new int[3];
        SalaryCalculator sc1  =  new SalaryCalculator();
        SalaryCalculator sc2  =  new SalaryCalculator();
        SalaryCalculator sc3  =  new SalaryCalculator();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Employee hourly rate: ");
        sc1.setRate(input.nextInt());
        System.out.print("Please Enter Hours Employee worked : ");
        sc1.setHours(input.nextInt());
        sc1.calculateSalary();

        System.out.print("Please Enter Employee hourly rate: ");
        sc2.setRate(input.nextInt());
        System.out.print("Please Enter Hours Employee worked : ");
        sc2.setHours(input.nextInt());
        sc2.calculateSalary();

        System.out.print("Please Enter Employee hourly rate: ");
        sc3.setRate(input.nextInt());
        System.out.print("Please Enter Hours Employee worked : ");
        sc3.setHours(input.nextInt());
        sc3.calculateSalary();
    }
}