package tutorials_java_io;

import java.io.*;

public class io_test {

	public static String numbering(int start, int finish) {
		int i = start;
		String output = "";
		while (i < finish) {
			output += i;
			i++;
		}
		return output;
	}
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
		try {
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		out.write(result);
		out.close();
		}
		catch (IOException e) {
		
		}
	}
}
