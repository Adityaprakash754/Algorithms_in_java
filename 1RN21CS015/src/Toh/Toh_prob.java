package Toh;

public class Toh_prob {

	public void toh(int n, char s, char t, char d) {
		if (n == 0)
			return;
		toh(n - 1, s, d, t);
		// System.out.println(n + " is moved from " + s + " to " + d);
		toh(n - 1, t, s, d);
	}
}
