import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 - Create a scanner and an array of size 3
    double num[] = new double[3];
    Scanner sc = new Scanner(System.in);
    double input;
    input = sc.nextDouble();
    num[0] = sc.nextDouble();
    num[1] = sc.nextDouble();
    num[2] = sc.nextDouble();
    sc.close();

    
    

    double sum = 0;
    for (double i : num)
    {
      System.out.print(i + " ");
      sum = sum + i;
    }
    System.out.println("The sum is " + sum);


  
    // problem 2
    System.out.println(sumsOfNums(8));
  }

  public static int[] sumsOfNums(int input)
  {
    // Implement Problem 2 here
    int[] a = new int[input];
    int sum = 0;
    for (int i = 0; i < a.length; i++)
    {
      sum = sum + i;
      a[i] = sum;
      System.out.print(sum + " ");
    }
    return a;
    
   
  }
}
