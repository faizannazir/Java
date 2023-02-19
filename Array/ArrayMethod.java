import java.util.Arrays;
public class ArrayMethod
{
    
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,6,7,8,4,32,345,555,5};
        int b[] = new int[a.length];
        // Length of String

        System.out.println("Array a = " + Arrays.toString(a));
        System.out.println("Array length  a.length => " + a.length);
        // Sort
        Arrays.sort(a);
        System.out.println("Arrays.sort(a) sort orignal array now a =  " + Arrays.toString(a)); 
        Arrays.fill(b,10);
        System.out.println("Arrays.fill(b,10) fill array b with 10 b =  " + Arrays.toString(b)); 
        b = Arrays.copyOf(a,a.length);
        System.out.println(" b = Arrays.copyOf(a,a.length) copy array a value in array b =  " + Arrays.toString(b)); 

        System.out.println(" Arrays.equals(a,b)   match  2 arrays  " + Arrays.equals(a,b)); 

    }
}