public class SUmOfOddAndEvenNumbers
{
    public static void main(String args[])
    {
        int oddSum=0;
        int evenSum=0;
        for(int i=1; i<=20; i++)
        {
            if(i%2==0)
            {
                evenSum+=i;
            }
            else
            {
                oddSum+=i;
            }
        }
        System.out.println("Sum of Even numbers: "+evenSum);
        System.out.println("Sum of Odd numbers: "+oddSum);
    }
}
//Output:
        //Sum of Even numbers: 110
        //Sum of Odd numbers: 100
