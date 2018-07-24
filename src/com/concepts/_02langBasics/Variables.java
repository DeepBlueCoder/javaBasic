package com.concepts._02langBasics;

public class Variables
{
    // Instance Variables (Non-Static Fields)
    
    String name;
    int age;
    char sex;
    boolean married;
    // Class Variables (Static Fields)
    
    static String address;
    static int pincode;

    public static void main(String[] args)
    {
	// Local Variables
	int num1;
	int num2 = 20;
	
	Variables v1 = new Variables();
	v1.name="Donald Trump";
	v1.age=72;
	v1.sex='M';
	v1.married=true;
	
	v1.address="1600 Pennsylvania Ave NW, Washington, DC 20500, USA";
	v1.pincode=37188;
	
	Variables v2 = new Variables();
	v2.name="Melania Trump";
	v2.age=48;
	v2.sex='F';
	v2.married=true;
	
	System.out.println(v1.name);
	System.out.println(v1.age);
	System.out.println(v1.married);
	System.out.println(v1.sex);
	System.out.println(v1.address);
	System.out.println(v1.pincode);
	
	System.out.println(Variables.address);
	System.out.println(Variables.pincode);
		
	System.out.println(v2.name);
	System.out.println(v2.age);
	System.out.println(v2.married);
	System.out.println(v2.sex);
	System.out.println(v2.address);
	System.out.println(v2.pincode);
	

    }

}
