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