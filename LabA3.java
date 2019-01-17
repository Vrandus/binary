
public class LabA3 {
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z;
		System.out.println(Integer.parseInt(Integer.toBinaryString(x)));
		System.out.println(Integer.parseInt(Integer.toBinaryString(y)));
		z = x & y;
		System.out.println(Integer.parseInt(Integer.toBinaryString(z)));
		z = x|y;
		System.out.println(Integer.parseInt(Integer.toBinaryString(z)));
		z = x ^ y;
		System.out.println(Integer.parseInt(Integer.toBinaryString(z)));
		z = ~x;
		System.out.println(Integer.parseInt(Integer.toBinaryString(z)));
	}

}
