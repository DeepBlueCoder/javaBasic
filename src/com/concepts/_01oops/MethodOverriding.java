package com.concepts._01oops;

public class MethodOverriding
{
    public static void main(String[] args)
    {
	MethodOverridingParent mop = new MethodOverridingChild();

	mop.multiplication(5, 12);

	mop.throwsException();
    }
}

class MethodOverridingParent
{

    int multiplication(int num1, int num2)
    {
	System.out.println("In Parent multiplication");
	return num1 * num2;
    }

    public void throwsException() throws IndexOutOfBoundsException
    {
	System.out.println("Parent : In IndexOutOfBoundsException method");
    }

}

class MethodOverridingChild extends MethodOverridingParent
{

    // Access of child class method can only be widened while overriding
    public int multiplication(int num1, int num2)
    {
	System.out.println("In Child multiplication");
	return (num1 * num2);
    }

    // While overriding method in child class can throw child or parent exception class of parent's method exception

    public void throwsException() throws RuntimeException
    {
	System.out.println("Child : In RuntimeException method");
    }
    
    /*  public void throwsException() throws ArrayIndexOutOfBoundsException
    {
	System.out.println("Child : In ArrayIndexOutOfBoundsException method");
    }*/

}