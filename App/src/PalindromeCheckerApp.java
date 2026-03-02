import java.util.Scanner;
public class PalindromeCheckerApp
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string to check if palindrome or not");
        String input = sc.nextLine();
        String reversed = "";

        for (int i=input.length()-1; i>=0 ; i--)
        {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed))
        {
            System.out.println(input+" is a palindrome");
        }
        else
        {
            System.out.println(input+" is not a palindrome");
        }
        sc.close();
    }
}
