public class ArraySum
{

    public static void main(String args[])
    {
        int[][] a = {{1,2,3},{4,5,6},{7,8,6}};
        int[][] b = {{1,2,3},{4,5,6},{7,8,6}};
        int c[][] = new int[3][3];
        for(int row = 0; row<a.length; row++)
        {
            for(int col = 0; col<a.length; col++)
            {
                c[row][col] = a[row][col] + b[row][col];
            }
        }
        for(int row[] : c)
        {
            for(int i : row)
            {
                System.out.println(i);
            }
        }
    }
}
