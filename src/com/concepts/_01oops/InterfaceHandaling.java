package com.concepts._01oops;

public class InterfaceHandaling implements Digital
{

    
    public static void main(String[] args)
    {
	InterfaceHandaling ih = new InterfaceHandaling();
	ih.diode();
	ih.dNAComputer();
	ih.iChip();
	ih.registor();
	System.out.println(InterfaceHandaling.registorCode);
	System.out.println(Analog.registorCode);
	System.out.println(ih.registorCode);

    }

    @Override
    public void diode()
    {
	System.out.println("diode implemented");
	
    }

    @Override
    public String registor()
    {
	System.out.println("registor implemented");
	return null;
    }

    @Override
    public void iChip()
    {
	System.out.println("IChip implemented");
	
    }

    @Override
    public void dNAComputer()
    {
	System.out.println("DNAComputer implemented");
	
    }

}

interface Analog
{
    String registorCode="47 kΩ";
    public void diode();
    String registor();
}

interface Digital extends Analog
{
//    int mirsoprocessor; can't define a variable only final constant be declared
    void iChip();
//    protected void nanoCircuit(); Only public methods can be declared
    public void dNAComputer();
    
}