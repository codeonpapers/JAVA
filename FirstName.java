import java.util.Scanner;
class Firstname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First name: ");
        String firstName=sc.nextLine();
        System.out.print("Enter Middle name: ");
        String middleName=sc.nextLine();
        System.out.print("Enter Last name: ");
        String lastName=sc.nextLine();
        System.out.println("First name: "+firstName);
        System.out.println("Middle name: "+middleName);
        System.out.println("Last name: "+lastName);
    }
}
//Output:
        //Enter First name: Dipali
        //Enter Middle name: Ramesh
        //Enter Last name: Tele
        //First name: Dipali
        //Middle name: Ramesh
        //Last name: Tele