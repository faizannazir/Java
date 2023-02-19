import java.util.Arrays;
public class copyof
{
    public static void main(String [] arg)
    {
        int [] ar = {4,3,2,5};     
        int[] x = new int[5];
        x= Arrays.copyOf(ar,ar.length);     // make copy of array ar with full length 
                                           //  first argument array which you want to copy 2nd number of elements you want to copy
        for(int i: x)
        {
            System.out.println(i);
        }
        
    }
}