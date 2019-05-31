package tutorials_java_cal;

import java.io.*;

class cal{
	static double PI = 3.14;
	int left, right;
	
	public void setting(int l, int r) {
		this.left = l;
		this.right = r;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class calculator {
	
	public static void main(String[] args) {
		cal c1 = new cal();
		cal c2 = new cal();
		System.out.println(c1.PI);
		c2.PI = 5;
		System.out.println(c1.PI);
		System.out.println(c2.PI);
	}

}
