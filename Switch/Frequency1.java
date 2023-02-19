import java.util.Random;
public class Frequency1
{
    public static void main(String[] args)
    {
        Random randNum = new Random();
        int[] face = new int[20];
        int f1 =0;
        int f2 =0;
        int f3 =0;
        int f4=0;
        int f5 =0;
        int f6 = 0;
        for(int i=1; i<=20;i++)
        {
            face[i-1] = 1 + randNum.nextInt(6);
            System.out.print(face[i-1] + " ");
            if(i%5==0)
            {
                System.out.println();
            }
        switch (face[i-1])
        {
            case 1:
                   f1++;
                   break;
            case 2:
                   f2++;
                   break;
            case 3:
                   f3++;
                   break;
            case 4:
                   f4++;
                   break;
            case 5:
                   f5++;
                   break;
            case 6:
                   f6++;
                   break;
            default:
               break;
        }

        }
    System.out.println("Frequency of 1: "+f1);
    System.out.println("Frequency of 2: "+f2);
    System.out.println("Frequency of 3: "+f3);
    System.out.println("Frequency of 4: "+f4);   
    System.out.println("Frequency of 5: "+f5);
    System.out.println("Frequency of 6: "+f6);

    }
}