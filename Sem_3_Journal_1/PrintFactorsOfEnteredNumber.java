import java.util.Scanner;
public class PrintFactorsOfEnteredNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int fact=sc.nextInt();
        for(int i=1; i<=fact; i++)
        {
            if(fact%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
//Output:
//Enter number: 8
//1
//2
//4
//8
