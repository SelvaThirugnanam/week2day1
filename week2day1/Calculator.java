package week2day1;

public class Calculator
{
	public static void main(String[] args)
	{
	Calculator function=new Calculator();
	int c=function.additionTwoNumber(40, 60);
	System.out.println("The sum is "+c);
	int d=function.subractionTwoNumber(80, 20);
	System.out.println("The difference is "+d);
	double g=function.multipleTwoNumber(20, 20);
	System.out.println("The product is "+g);
	float h=function.divideTwoNumber(70,5);
	System.out.println("The division is "+h);

}
     public int additionTwoNumber(int a,int b)
     {
	     return a+b;
     }
     public int subractionTwoNumber(int e,int f)
     {
	     return e-f;
     }
     public double multipleTwoNumber(double i,double j)
     {
	     return i*j;
      }
     public float divideTwoNumber(float x,float y)
     {
	return x/y;
      }
}

