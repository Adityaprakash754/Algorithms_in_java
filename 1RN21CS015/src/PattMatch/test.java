package PattMatch;

public class test {
	public static void main(String[] args) {
		Demo obj = new Demo();
		int i = obj.patMat();

		if (i != -1)
			System.out.println("Found at " + i);
		else
			System.out.println("Not Found ");
	}
}
