enum Month
{
    Jan,
    Feb,
    Mar
}

public class Overrloading {

    public void m1(int a)
    {
        System.out.println("integer " + a);
    }
    public void m1(Object o)
    {
        System.out.println("Object class");
    }
    public void m1(String s)
    {
        System.out.println("String class");
    }
    public void m1(StringBuffer s)
    {
        System.out.println("StringBuffer class");
    }
    public void m1(int... i)
    {
System.out.println("Var args");
    }
    // public void m1(float b)
    // {
    //     System.out.println("Float " + b);
    // }
    public static void main(String args[])
    {
        Overrloading obj = new Overrloading();
        obj.m1(10L);
        obj.m1(new Object());
        obj.m1("null");
        obj.m1(1);
        obj.m1(1,2,3,4,5);
        // obj.m1(null); error string and String buffer both accept null
        Month m  = Month.Jan;
        switch(m)
        {
            case Jan:
                System.out.println("Jan");
                break;
            case Feb:
                System.out.println("Jan");
                break;
            case Mar:
                System.out.println("Jan");
                break;
            default:
                System.out.println("Not found");
        }
        System.out.println(m.toString());

    }
}
