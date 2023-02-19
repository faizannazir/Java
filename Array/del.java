class A extends Thread
{
    @Override
    public void run()
    {
        System.out.println("hello world from thred okay");
        for(int i=0; i<20; i++)
        {
            for(int j=0; j<20; j++)
            {
                // ar[i][j] = 2;
                System.out.println("hello from thred");
            }
        }

    }
}


public class del
{
    public static void main(String [] arg)
    {
        // int [][] ar = new int[2][2];
        // for(int i=0; i<2; i++)
        // {
        //     for(int j=0; j<2; j++)
        //     {
        //         ar[i][j] = 2;
        //     }
        // }
        // for(int i=0; i<2; i++)
        // {
        //     for(int j=0; j<2; j++)
        //     {
        //        System.out.println(ar[i][j]);
        //     }
        // }
        A t1 = new A();
        t1.start();
        System.out.println("hello from main----------------");
    }
}