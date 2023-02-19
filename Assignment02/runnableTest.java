class A implements Runnable
{
    public void run()
    {
        for(int i=0; i<8; i++)
        {
            System.out.print("hello world "+i);
        }
    }
}

public class runnableTest {
    public static void main(String [] arg)
    {
        A r1 = new A();
        Thread t1 = new Thread("taskONe",r1);
        t1.start();
    }
    
}