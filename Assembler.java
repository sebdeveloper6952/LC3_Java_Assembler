package org.sebdeveloper6952.assembler;

import java.util.Map;
import java.util.HashMap;
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
		String[] lines = readFileintoArray(filePath);
	}

	private void initMapInstructions()
	{
		_mapInstructions.put("ADD", "0001");
		_mapInstructions.put("AND", "0101");
		_mapInstructions.put("BR", "0000");
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
	* Read file and return lines in array.
	*/
	private String[] readFileintoArray(String filePath)
	{
		Scanner s = null;
		String[] lines = null;
		List<String> linesList = null;
		try
		{
			new Scanner(new BufferedReader(new FileReader(filePath)));
			list = new ArrayList<>();
			while(s.hasNextLine())
			{
				list.add(s.nextLine());
			}
			lines = list.toArray();
		}
		catch(Exception e) { System.out.println(e.getMessage()); }
		finally
		{
			if(s != null) s.close();
		}
		return null;
	}
}