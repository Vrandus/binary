import java.util.Scanner;
import java.io.PrintStream;
public class LabA4 {
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		PrintStream out = System.out;
		
		int x = Integer.parseInt(args[0]);
		
		int z = x << 21;
		int y = z >>> 31;
		
		out.println("Original in Binary = " + Integer.toBinaryString(x));
		
		out.println("Left Shifted 21 = " + Integer.toBinaryString(z));
		out.println("Right Shifted 31 = " + Integer.toBinaryString(y));
		
		int mask = 1024;
		int output = x & mask;
		output = output >> 10;
		
		out.println("Mask anded and right shifted 10 = " + Integer.toBinaryString(output));
	}

}
