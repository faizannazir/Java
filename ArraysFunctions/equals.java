import java.util.Arrays;
public class equals
{
    public static void main(String [] arg)
    {
        int [] ar = {4,3,2,5};
        int [] ar1 = {4,3,2,5};

        if(Arrays.equals(ar,ar1))          // check if ar and ar1 are equal or not 
        {
            System.out.println("both are equal");
        }
        else
        {
            System.out.println("both are not equal");
        }
       
    }
}