package com.concepts._02langBasics;

public class Blocks
{

    public static void main(String[] args)
    {
	StaticAndInstanceInitializationBlock block0;
	
	StaticAndInstanceInitializationBlock block1 = new StaticAndInstanceInitializationBlock();
	
	System.out.println(block1.num);
	System.out.println(block1.str);
	
	StaticAndInstanceInitializationBlock block2;
	block2 = new StaticAndInstanceInitializationBlock(007, "James Bond");

	System.out.println(block2.num);
	System.out.println(block2.str);
    }

}

class StaticAndInstanceInitializationBlock
{
    int num;
    String str;
    
    {
	System.out.println("first InstanceInitializationBlock");
    }
    
    static
    {
	System.out.println("First static block");
    }
    
    {
	System.out.println("Second InstanceInitializationBlock");
    }

    StaticAndInstanceInitializationBlock()
    {
	num = 10;
	str = "India";
    }
    
    StaticAndInstanceInitializationBlock(int num, String str)
    {
	this.num=num;
	this.str=str;
    }
    
    static
    {
	System.out.println("Second static block");
    }
    
    {
	System.out.println("Third InstanceInitializationBlock");
    }
}