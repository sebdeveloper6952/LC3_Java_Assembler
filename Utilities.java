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
}