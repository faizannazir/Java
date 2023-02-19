import java.util.Arrays;
public class sort
{
    public static void main(String [] arg)
    {
        int [] ar = {4,3,2,5};
        Arrays.sort(ar);        // Sort array ar 
        for(int i=0; i<4; i++)
        {
            System.out.println(ar[i]);
        }
        
    }
}