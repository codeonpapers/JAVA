import java.util.Scanner;
public class SumOfNNumbers
{
    public static void main(String args[])    
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 'n' number: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            sum+=i;
        }
        System.out.println("Sum: "+sum);
    }
}
//Output:
//Enter 'n' number: 5
//Sum: 15