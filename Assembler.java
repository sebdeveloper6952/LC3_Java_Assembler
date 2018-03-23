import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Assembler
{
	private Map<String, String> _mapInstructions;

	public Assembler()
	{
		_mapInstructions = new HashMap<>();
		initMapInstructions();
	}

	public void assemble(String filePath)
	{
		List<String> lines = readFileIntoList(filePath);
		for(String s : lines)
		{
			// separate instruction in parts
		}
	}

	/**
	* Prepare map holding associations between assembler and binary representations.
	*/
	private void initMapInstructions()
	{
		_mapInstructions.put("ADD", "0001");
		_mapInstructions.put("AND", "0101");
		_mapInstructions.put("BR", "0000");
		_mapInstructions.put("BRnzp", "0000");
		_mapInstructions.put("BRn", "0000");
		_mapInstructions.put("BRz", "0000");
		_mapInstructions.put("BRp", "0000");
		_mapInstructions.put("BRnz", "0000");
		_mapInstructions.put("BRzp", "0000");
		_mapInstructions.put("JMP", "1100");
		_mapInstructions.put("JSR", "0100");
		_mapInstructions.put("JSRR", "0100");
		_mapInstructions.put("LD", "0010");
		_mapInstructions.put("LDR", "1010");
		_mapInstructions.put("LDR", "0110");
		_mapInstructions.put("LEA", "1110");
		_mapInstructions.put("AND", "0101");
		_mapInstructions.put("NOT", "1001");
		_mapInstructions.put("RET", "1100");
		_mapInstructions.put("RTI", "1000");
		_mapInstructions.put("ST", "0011");
		_mapInstructions.put("STI", "1011");
		_mapInstructions.put("STR", "0111");
		_mapInstructions.put("TRAP", "1111");
	}

	/**
	* Read file and return lines in List.
	*/
	private List<String> readFileIntoList(String filePath)
	{
		Scanner s = null;
		List<String> lines = null;
		try
		{
			s = new Scanner(new BufferedReader(new FileReader(filePath)));
			lines = new ArrayList<>();
			while(s.hasNextLine())
			{
				lines.add(s.nextLine());
			}
		}
		catch(Exception e) { System.out.println(e.getMessage()); }
		finally
		{
			if(s != null) s.close();
		}
		return lines;
	}
}