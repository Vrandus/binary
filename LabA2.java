
public class LabA2 {
	public static void main(String[] args)
	{
		int input = Integer.parseInt(args[0]);
		System.out.println("Output is " + Integer.toHexString(input));
		
		System.out.println("New Output is " + Integer.toHexString(Integer.reverse(input)));
		
		System.out.println("3rd Output is " + Integer.toHexString(Integer.reverseBytes(input)));
	}

}
