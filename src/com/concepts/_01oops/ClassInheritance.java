package com.concepts._01oops;

public class ClassInheritance
{
    public static void main(String[] args)
    {
	FeaturePhone fp = new SmartPhone();

	fp.func();
	System.out.println(fp.mobile);
	System.out.println(fp.mobilePrice);

	fp.mobile = "Micromax A1";
	fp.mobilePrice = 1999;
	
	System.out.println(fp.mobile);
	System.out.println(fp.mobilePrice);
	
	SmartPhone sp = new SmartPhone();
	
	System.out.println();
	sp.foo();
	sp.func();
	System.out.println(sp.mobile);
	System.out.println(sp.mobilePrice);
	System.out.println(sp.generation);
	System.out.println(sp.os);
	
	sp.generation=20;
	sp.mobile="Lawa Bomb";
	sp.mobilePrice=799;
	sp.os="Android";
	
	System.out.println();
	sp.foo();
	sp.func();
	System.out.println(sp.mobile);
	System.out.println(sp.mobilePrice);
	System.out.println(sp.generation);
	System.out.println(sp.os);

    }
}

class FeaturePhone
{
    int mobilePrice;
    String mobile;

    FeaturePhone()
    {
	mobilePrice = 1000;
	mobile = "Nokia 1100";
    }

    public void func()
    {
	System.out.println("In Func");
    }
}

class SmartPhone extends FeaturePhone
{
    int generation;
    String os;

    SmartPhone()
    {
	mobilePrice = 5000;
	mobile = "New Nokia 1100";

	generation = 8;
	os = "iOS 8";

    }

    void foo()
    {
	System.out.println("In Foo");
    }
}