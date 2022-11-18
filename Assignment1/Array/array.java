public class array
{
    public static void main(String[] args)
{
   int[] A = {0,0,0,0,1,2,3,4,5,6,7};
   for(int i = 0;i<=A.length;i++)
   {
       if(i==10)
       {
           System.out.printf(" %5d ", 100);
       }
       else
       {
           System.out.printf(" %02d-%02d ", i*10,i*10+9);
       }

    for(int j =0; j<A[i];j++)
    {
        System.out.print("*");
    }

    System.out.println();
   }
}

}