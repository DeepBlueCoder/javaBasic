package com.concepts._01oops;

public class ClassAndObjects
{

    public static void main(String[] args)
    {
	Parent p = new Parent();

	Parent pc = new Child();

	Child c = new Child();

	p.father = "Karamchand Gandhi";
	p.mother = "Putlibai Gandhi";

	System.out.println(p.father);
	System.out.println(p.mother);
	p.payFees();
	System.out.println();

	pc.father = "Motilal Nehru";
	pc.mother = "Swaruprani Thussu";

	System.out.println(pc.father);
	System.out.println(pc.mother);
	pc.payFees();
	System.out.println();

	c.father = "Rajiv Gandhi";
	c.mother = "Sonia Gandhi";
	c.daughter = "Priyanka Gandhi Vadra";
	c.son = "Rahul Gandhi";

	System.out.println(c.father);
	System.out.println(c.mother);
	System.out.println(c.son);
	System.out.println(c.daughter);
	c.payFees();
	c.payHospitalBillOfParents();

    }

}

class Parent
{
    String father;
    String mother;

    public void payFees()
    {
	System.out.println(father + " will pay the fee of children");
    }
}

class Child extends Parent
{
    String son;
    String daughter;

    public void payHospitalBillOfParents()
    {
	System.out.println(son + " will pay hospital bills of " + father + " and " + mother);
    }

    public void payFees()
    {
	System.out.println(father + " will pay the fee of " + son + " and " + daughter);
    }
}