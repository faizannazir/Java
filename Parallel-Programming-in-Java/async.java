class A
{
    public static void main(String [] args )
    {
        int a=5;
            finish(()->
    {
        async(()->
        {
    for(int i=0; i<a; i++)
    {
        System.out.println("1st loop sum = :"+ (i+a));
    }
        });

    });

    for(int i=0; i<a; i++)
    {
        System.out.println("2nd loop sum = :"+ (i+a));
    }
    }

}