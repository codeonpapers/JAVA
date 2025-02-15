import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        while(num>0)
        {
            int lastVal=num%10;
            System.out.print(lastVal);
            num/=10;
        }
    }
}
// Output:
// Enter number: 123
// 321