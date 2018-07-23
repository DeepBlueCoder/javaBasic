package com.concepts._01oops;

public class MethodOverloading
{

    public static void main(String[] args)
    {

	MethodOverloading ml = new MethodOverloading();

	ml.add(10, 22);

	ml.add(10l, 22l);

	ml.add(10.25f, 22.64f);

	ml.add(10.25, 22.64);

	System.out.println( "max of 10 and 12 is " + ml.maxOfTwo(10, 12));
	
	System.out.println( "max of 10 and 12 is " + ml.maxOfTwo(100, 12000000l));
	
	try
	{
	    ml.methodWithThrowClause();
	    ml.methodWithThrowClause(007);
	    ml.methodWithThrowClause("Hi Anil");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	    e.printStackTrace();
	}
	catch(IndexOutOfBoundsException e)
	{
	    e.printStackTrace();
	}
	catch(RuntimeException e)
	{
	    e.printStackTrace();
	}
    }

    // modified return type of methods does not impact the overloading
    public int add(int num1, int num2)
    {
	System.out.println("I am in int add method");
	System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

	return num1 + num2;
    }

    public long add(long num1, long num2)
    {
	System.out.println("I am in long add method");
	System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

	return num1 + num2;
    }

    public float add(float num1, float num2)
    {
	System.out.println("I am in float add method");
	System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

	return num1 + num2;
    }

    public double add(double num1, double num2)
    {
	System.out.println("I am in double add method");
	System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

	return num1 + num2;
    }
    
    // modified access of methods does not impact the overloading
    public int maxOfTwo( int num1, int num2)
    {
	System.out.println("I am in int-int max");
	return (num1>num2) ? num1 : num2;
    }
    
    protected long maxOfTwo( int num1, long num2)
    {
	System.out.println("I am in int-long max");
	return (num1>num2) ? num1 : num2;
    }
    
 // Throws clause of methods does not impact the overloading
    public void methodWithThrowClause() throws IndexOutOfBoundsException
    {
	System.out.println("In IndexOutOfBoundsException method");
    }
    
    public void methodWithThrowClause(String msg) throws ArrayIndexOutOfBoundsException
    {
	System.out.println("In ArrayIndexOutOfBoundsException method");
    }
    
    public void methodWithThrowClause(int errorCode) throws RuntimeException
    {
	System.out.println("In RuntimeException method");
    }

}
