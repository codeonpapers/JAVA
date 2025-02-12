import java.util.Scanner;
public class PrintNNumbers
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' number: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
//Output:
//Enter 'n' number: 5
//1
//2
//3
//4
//5