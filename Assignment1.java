
public class Assignment1 
{
	public static void main(String[] args)
	{
		char newChar= (char)((int)args[0].charAt(0)+Integer.parseInt(args[1]));
		System.out.println("New char is " + newChar + ".");
	}
}
