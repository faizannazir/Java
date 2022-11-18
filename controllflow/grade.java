import java.util.Scanner;
class GradeBook
{
    private String courseName;
    private int n=0;
    GradeBook( String courseName)
    {
        this.courseName = courseName;
    }

void display()
{

System.out.printf("Welcome to %s \n" , courseName);
}

void checkPassFail()
{
    Scanner sc = new Scanner(System.in);
    int pass =0;
    int fail =0;

    float grade;
    while(n<10)
    {
        System.out.printf("Enter Grade of student %d:  ",n+1);
        grade = sc.nextInt();
        if(grade>5.0)
        {
            pass+=1;
        }
        else
        {
            fail+=1;
        }

        n++;
    }
    System.out.printf("%d students \n" , n); 
    System.out.printf("%d students are pass \n" , pass);
    System.out.printf("%d students are fail \n" , fail);

}


}

class Test
{

public static void main( String args[])
{
    GradeBook gb = new GradeBook("Modern Programming Language");
    gb.display();
    gb.checkPassFail();

}

}