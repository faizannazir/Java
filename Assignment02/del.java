import java.util.Arrays;
public class del
{
    public static void main(String [] arg)
    {
        int [] ar = {4,3,2,5};
        int [] ar1 = {4,3,2,5,21};
        // var tmp;
        // Arrays.sort(ar);
        // for(int i=0; i<4; i++)
        // {
        //     System.out.println(ar[i]);
        // }
        // if(Arrays.equals(ar,ar1))
        // {
        //     System.out.println("both are equal");
        // }
        // else
        // {
        //     System.out.println("both are not equal");
        // }
        // for(int i : ar)
        // {
        //     System.out.println(i);

        // }
        //  int [] x= Arrays.copyOfRange(ar,2,4);
        //  int[] x = ar.clone();
        int[] x = new int[5];
         Arrays.fill(x,10);
        for(int i: x)
        {
            System.out.println(i);
        }
        
    }
}