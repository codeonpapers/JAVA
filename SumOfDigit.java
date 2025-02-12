import java.util.Scanner;
public class SumOfDigit
{
    public static void main(String args[])
    {
        int lastVal;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");;
        int num=sc.nextInt();
        while(num>0)
        {
            lastVal=num%10;
            sum+=lastVal;
            num/=10;;
        }
        System.out.println("Sum: "+sum);
    }
}
// Output:
// Enter number: 123
// Sum: 6