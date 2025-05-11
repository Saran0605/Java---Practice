import java.util.*;

class a2 {
	public static void main(String args[]) {
		int n[] = { 10, 11, 12, 13, 14, 15, 16, 17 };
		int len = n.length;
		int first = 0;
		int last = len;
		int m1 = (first + last) / 2;
		int m2 = m1 - 1;
		double mid = (n[m1] + n[m2]) / 2.0;
		System.out.println(n[m1]);
		System.out.println(n[m2]);
		System.out.print(mid);

	}
}