import java.util.Arrays;
public class fill
{
    public static void main(String [] arg)
    {
        int[] x = new int[5];
         Arrays.fill(x,10);  // fill every index of array x with value 10
        for(int i: x)
        {
            System.out.println(i);
        }
        
    }
}