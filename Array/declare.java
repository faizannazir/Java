class Even
{
    public static void main(String[] args)
    {

    int[] B = new int[10];
    int val=2;

    for (int even=0;even<B.length; even++)
    {
        B[even] = val;
        val+=2;

    }
    System.out.printf("Array index \t\t Value");
    System.out.println();
   for(int i = 0;i<=B.length;i++)
   {
       System.out.printf("\t %d \t\t %d",i,B[i]);
       System.out.println();
    }
    }
}