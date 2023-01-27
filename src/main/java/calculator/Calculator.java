package calculator;

public class Calculator {

  public int add(int a, int b) {return a + b;}

  public double divide(int a, int b) {

    if (b == 0)
    {
       System.out.println("Division par zero");

       if(a < 0)
         return Double.MIN_VALUE;
       else if(a == 0)
         return 0;
       else
         return Double.MAX_VALUE;

    }

    return (double)a / b;
  }
}
