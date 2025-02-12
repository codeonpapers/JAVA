import java.util.Scanner;
public class CheckEnteredNUmberIsPerfectOrNot
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not perfect number");
        }
    }
}
// //Output:
// Enter number: 6
// Perfect number