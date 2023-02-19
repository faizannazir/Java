public class arrayFunctions
{
            int [] array = {1,2,3,4,5};

       public void print()
        {
            for(int val : array)
            {
                System.out.print(val + " ");
            }
            System.out.println();
            modifiedArray(array);
            System.out.println("Elements of modified array is:");
            for(int val : array)
            {
                System.out.print(val + " ");
            }
            modifyIndex(array[3],array);
         for(int val : array)
            {
                System.out.print(val + " ");
            }
        }
        static void modifiedArray(int[] array)
        {
            for(int val=0; val< array.length;val++)
            {
                array[val] *= 2;
            }

        }
        static void modifyIndex(int index, int[] array)
        {
            for(int val=0; val< array.length;val++)
            {
                if(array[val] == index)
                {
                    array[val]*=2;
                    System.out.println("Successfully updated");
                }
                else 
                {
                    System.err.printf("%d not found in array", index);
                }

            }
        }

    public static void main(String args[])
    {

        arrayFunctions obj = new arrayFunctions();
        obj.print();
        
    }
}