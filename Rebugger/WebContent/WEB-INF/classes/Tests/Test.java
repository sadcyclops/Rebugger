package Tests;

import Exceptions.RegisterException;
import Structures.RegisterFile;

public class Test {
	public static void main(String[] args) throws RegisterException {
		RegisterFile test = new RegisterFile();
		test.setByte(0,0,255);
		test.setByte(0,1,255);
		test.setByte(0,3,255);
		test.setByte(0, 2, 255);
		System.out.println(test.getInt(0));
	}
}
