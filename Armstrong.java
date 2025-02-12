import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])    
    {
        int lastVal;
        double powVal;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int temp=num;
        while(num>0)
        {
            lastVal=num%10;
            powVal=Math.pow(lastVal, 3);
            sum+=powVal;
            num/=10;
        }
        if(temp==sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
        System.out.println("temp: "+temp);
        System.out.println("sum: "+sum);
    }
}
// Output:
// Enter number: 270
// Not Armstrong
// temp: 270
// sum: 351