package Tests;

public class Test {
	public static void main(String[] args) {
		RegisterFile test = new RegisterFile();
		test.setByte(0,300);
		System.out.println(test.getByte(0,1));
	}
}
