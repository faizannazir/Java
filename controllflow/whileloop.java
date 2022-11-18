import java.util.Scanner;
class GradeBook
{
    private String courseName;
    private int n=1;
    GradeBook( String courseName)
    {
        this.courseName = courseName;
    }

void displayCourseName()
{

System.out.println("Welcome to " + courseName);
}

void check()
{
    Scanner input = new Scanner(System.in);
    int pass =0;
    int fail =0;

    int grade;
    while(n<=10)
    {
        System.out.println("Enter Grade of student  "+n);
        grade = input.nextInt();
        if(grade>5)
        {
            pass+=1;
        }
        else
        {
            fail+=1;
        }

        n++;
    }
    System.out.printf("%d students are pass \n" , pass);
    System.out.printf("%d students are fail \n" , fail);

}


}

class TestProgram
{

public static void main( String args[])
{
    GradeBook obj = new GradeBook(" MPL ");
    obj.displayCourseName();
    obj.check();

}

}