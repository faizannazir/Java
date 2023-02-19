public class A_2d
{
    public static void main(String args[])
    {
        int[][] result = new int[4][4];
    for (int row = 0; row < result.length; row++) 
     { 
        System.out.print("[");
        for (int col = 0; col < result[row].length; col++) 
        { 
            result[row][col] = row * col;
            System.out.print(result[row][col]);
            if(col!=result[row].length-1)
            {
                System.out.print(",");
            }
            
        } 
        System.out.println("]");
      }

    for(int[] Array : result)
    {
         System.out.print("[");
        for( int row : Array)
        {
            System.out.print(row);
            System.out.print(",");
        }
         System.out.println("]");
    }
    }
}