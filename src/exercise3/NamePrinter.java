package exercise3;

import java.util.Scanner;

public class NamePrinter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i < str.length (); i++)
        {
          System.out.println("* " + str.charAt(i) + " *");
        }
    }
}
