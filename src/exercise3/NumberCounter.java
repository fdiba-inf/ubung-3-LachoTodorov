package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);

      double avg = 0;
      double sum = 0;
      int positiveNumbers = 0;
      int negativeNumbers = 0;
      int number = input.nextInt();

      while (number != 0)
      {
        if (number > 0)
          {
            positiveNumbers++;
          } 
        else if (number < 0) 
          {
            negativeNumbers++;
          }
        sum += number;
        number = input.nextInt();
      }
        avg =  sum /(positiveNumbers + negativeNumbers);
        
        System.out.println("Positive numbers: " + positiveNumbers);
        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}