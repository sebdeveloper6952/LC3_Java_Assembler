import java.util.List;
import java.util.ArrayList;

public class Utilities
{
	public static String decToBin(int dec)
	{
		String res = "";
		while(dec > 0)
		{
			res += dec % 2;
			dec /= 2;
		}
		return new StringBuilder(res).reverse().toString();
	}

	public static List<String> separateString(String s, String[] delimiters)
	{
		// change all delimiters for the first one to simplify subsequent code
		if(delimiters.length > 1)
		{
			for(int i = 1; i < delimiters.length; i++)
			{
				s = s.replaceAll(delimiters[i], delimiters[0]);
			}
		}
		List<String> list = new ArrayList<>(6);
		int left = 0, right = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(i == s.length()-1) list.add(s.substring(left, right+1));
			else
			{
				if(Character.toString(s.charAt(i)).equals(delimiters[0]))
				{
					if(left != right)
					{
						list.add(s.substring(left, right));
					}
					right++;
					left = right;
				}
				else right++;
			}
		}
		return list;
	}

	public static String hexToBin(String hex)
	{
		return "";
	}
}