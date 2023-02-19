class Sum
{
    public static void main(String[] args)
    {
    int[] A = {32,47,64,18,63,70,37,60};
    int sum = 0 ;
    System.out.printf("Array index \t\t Value \t\t RS");
    System.out.println();
   for(int i = 0;i<=A.length;i++)
   {
      sum += A[i];
       System.out.printf("\t %d \t\t %d \t\t %d",i,A[i],sum);
       System.out.println();
    }
    }
}