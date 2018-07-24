package com.concepts._02langBasics;

public class BitOfArray
{

    public static void main(String[] args)
    {
	// Array declaration
	int arr1[];
	int arr2[] = { 1, 2, 5, 9, 11, 52, 39 };

	// Array initialisation

	arr1 = new int[] { 25, 35, 84, -3, 0, -1 };
	arr1[5] = 258;

	System.out.println("Print arr1");
	System.out.println(arr1);// This will only print object address not values
	for (int num : arr1)
	    System.out.println(num);

	System.out.println("Print arr2");
	System.out.println(arr2);
	for (int num : arr2)
	    System.out.println(num);

	arr1 = arr2;

	arr2 = new int[] { 0, 12, 0, -123, 21, 35, 65, 57, 76, 7, 567, 57 };

	System.out.println("Print arr1");
	System.out.println(arr1);
	for (int num : arr1)
	    System.out.println(num);

	System.out.println("Print arr2");
	System.out.println(arr2);
	for (int num : arr2)
	    System.out.println(num);

	char cArr[];
	cArr = new char[5];
	cArr[0] = 'a';
	cArr[1] = '3';
	cArr[2] = '#';
	cArr[3] = 'F';
	cArr[4] = ' ';

	System.out.println("Print cArr");
	System.out.println(cArr);
	for (char c : cArr)
	    System.out.println(c);
    }

}
