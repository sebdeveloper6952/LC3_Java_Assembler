package org.sebdeveloper6952.assembler;

public class Assemble
{
	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			Assembler a = new Assembler();
			a.assemble(args[0]);
		}
	}
}